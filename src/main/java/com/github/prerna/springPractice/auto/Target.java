package com.github.prerna.springPractice.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("gigi")
@Lazy
public class Target {
    private Foo fooOne, fooTwo;
    private Bar bar;

    public Target(){
        System.out.println("Target Constructor");
    }
    public Target (Foo foo ){
        System.out.println("Target(Foo) called" );
    }
    public Target(Foo foo, Bar bar){
        System.out.println("Target(Foo, Bar) called");
    }

    @Autowired
    @Qualifier("fooOne")
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("set FooOne");
    }

    @Autowired
    @Qualifier("fooTwo")
    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Set FooTwo");
    }

    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Set Bar");
    }

    /* public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/auto.xml");
        context.refresh();

       /*
       Target t = null;
        System.out.println("ByName : ");
        t = (Target)context.getBean("targetByName");
        System.out.println("ByType : ");
        t = (Target)context.getBean("targetByType");
        System.out.println("By Constructor : ");
        t = (Target)context.getBean("targetConstructor");

       Target t= context.getBean(Target.class);
        context.close();
        }
     */

    }

