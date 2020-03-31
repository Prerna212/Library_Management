package com.github.prerna.SpringChapter4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

public class SingerConfig {

    @Configuration
    static class SingerConfigDemo{

        @Lazy
        @Bean(initMethod = "init")
        Singer singerOne(){
            Singer singerOne = new Singer();
            singerOne.setName("Prerna");
            singerOne.setAge(22);
            return singerOne;
        }
        @Lazy
        @Bean(initMethod = "init")
        Singer singerTwo(){
            Singer singerTwo = new Singer();

            singerTwo.setAge(22);
            return singerTwo;
        }
        @Lazy
        @Bean(initMethod = "init")
        Singer singerThree(){
            Singer singerThree= new Singer();
            singerThree.setName("Prerna");

            return singerThree;
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(SingerConfigDemo.class);
        Singer ctx = new Singer();
        ctx.getBean("singerOne",context);
        ctx.getBean("singerTwo", context);
        ctx.getBean("singerThree", context);
    }
}
