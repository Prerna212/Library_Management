package com.github.prerna.springPractice.WithAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.github.prerna.springPractice.WithAnnotation"})
public class AppConfig {
}
