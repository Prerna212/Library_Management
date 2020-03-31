package com.github.prerna.springPractice.WithAnnotation;

import com.github.prerna.springPractice.MessageRenderer;

import org.springframework.context.ApplicationContext; import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
