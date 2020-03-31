package com.github.prerna.SpringChapter4;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PostConstruct;


public class Singer {
    private static final String DEFAULT_NAME = "Eric Clapton";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @PostConstruct
    public void init() throws Exception{
        System.out.println("Initializing bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set the age property of any beans of type " + Singer.class);
        }
    }

    public String toString() {
        return "\tName: " + name + "\n\tAge: " + age;
    }

  /*  public static void main(String... args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/chapter4.xml");
        context.refresh();
        getBean("singerOne", context);
        getBean("singerTwo", context);
        getBean("singerThree", context);
        context.close();
    }

   */
    public static Singer getBean(String beanName, ApplicationContext ctx){
        try{
            Singer bean = (Singer) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        }
        catch (BeanCreationException ex){
            System.out.println("An error occured in bean configuration: " + ex.getMessage());
            return null;
        }
    }
}