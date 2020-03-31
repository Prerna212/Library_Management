package com.github.prerna.springBootDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
public class Application {
private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        assert (context != null);
        logger.info(" Beans you were looking for : ");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(logger::info);

        HelloWorld hello = context.getBean(HelloWorld.class);

        System.in.read();
        context.close();
    }
}

