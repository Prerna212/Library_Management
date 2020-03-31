package com.github.prerna.springBootDemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.faces.annotation.RequestMap;

@RestController
public class HelloWorld {
    /*private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public void sayHi(){
        logger.info("Hello World!!");
    }*/

    @RequestMapping("/")
    public String sayHi(){
        return "Arsh, I LOVE YOU ";
    }

    @RequestMapping("/love")
    public String say(){
        return "asbcuehfiejfirjijfijerjrsdnkewfic nwiejf niqjef enfi iwenf niejfi niwefi ";
    }
}
