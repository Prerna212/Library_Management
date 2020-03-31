package com.github.prerna.Message;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestDemo {

    @Configuration
    static class MessageDisterConfig{

        @Bean
        public MessageDigestFactoryBean shaDigest(){
            MessageDigestFactoryBean factoryOne = new MessageDigestFactoryBean();
            factoryOne.setAlgorithmName("SHA1");
            return factoryOne;
        }

        @Bean
        public  MessageDigestFactoryBean defaultDigest(){
            return new MessageDigestFactoryBean();
        }

        @Bean
        MessageDigester digester() throws Exception{
            MessageDigester messageDigester = new MessageDigester();
            messageDigester.setDigest1(shaDigest().getObject());
            messageDigester.setDigest2(defaultDigest().getObject());
            return  messageDigester;
        }
    }
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/Digest.xml");
               context.refresh();
        MessageDigester digester = context.getBean("digester", MessageDigester.class);

        /*
        GenericApplicationContext context = new AnnotationConfigApplicationContext(MessageDisterConfig.class);

        MessageDigester digester = (MessageDigester) context.getBean("digester");*/
        digester.digest("Hello World");
        context.close();
    }
}
