package com.github.prerna.tutorial.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}
