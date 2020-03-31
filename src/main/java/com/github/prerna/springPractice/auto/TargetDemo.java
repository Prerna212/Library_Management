package com.github.prerna.springPractice.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TargetDemo {
    @Configuration
    static class TargetConfig{

        @Bean
        public Foo fooOne(){
            return new FooOne();
        }

        @Bean
        public Foo fooTwo(){
            return new FooTwo();
        }

        @Bean
        public Bar bar(){
            return new Bar();
        }

        @Bean
        public  Target target(){
            return new Target();
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(TargetConfig.class);
        Target t = context.getBean(Target.class);
        context.close();

    }
}
