package com.github.prerna.tutorial.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
public class ProfileConfig {

    @Bean
    public Profile profile(){
        return new Profile( student() );
    }

    @Bean
    public Student student(){
        return new Student();
    }
}
