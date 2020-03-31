package com.github.prerna.springPractice;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanNamingTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/naming.xml");
        context.refresh();

        Map<String, String> beans = context.getBeansOfType(String.class);

//        beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));
        beans.entrySet().stream().forEach(b -> {
            System.out.println("id : "+b.getKey()+"\n aliases : "+ Arrays.toString(context.getAliases(b.getKey()))+"\n ");
        });


//        String s1 = (String) context.getBean("str");
//        String s2 = (String) context.getBean("stri");
//        String s3 = (String) context.getBean("strin");
//        String s4 = (String) context.getBean("tring");


//        System.out.println((s1 == s2));
//        System.out.println((s2 == s3));
//        System.out.println((s3 == s4));
//        System.out.println((s1 == s4));
//        context.close();
    }
}
