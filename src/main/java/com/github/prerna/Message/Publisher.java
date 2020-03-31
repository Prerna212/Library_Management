package com.github.prerna.Message;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Publisher implements ApplicationContextAware {
public ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void publish(String message){
        context.publishEvent(new MessageEvent(this, message));
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/publish.xml");
        Publisher pub = (Publisher) context.getBean("publisher");
        pub.publish("hello World");
        pub.publish("hi there ");
    }
}
