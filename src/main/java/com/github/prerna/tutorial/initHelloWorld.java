package com.github.prerna.tutorial;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.Bean;

public class initHelloWorld implements BeanPostProcessor{
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before Initialization: " + beanName);
        return bean;
    }

public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization: "+ beanName);
        return bean;
    }

}
