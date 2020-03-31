package com.github.prerna.Message;

import org.springframework.context.support.GenericXmlApplicationContext;
import java.util.Locale;

public class MessageSourceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/source.xml");
        context.refresh();

        Locale english = Locale.ENGLISH;
        Locale germam = new Locale("de", "DE");

        System.out.println(context.getMessage("msg", null, english));
        System.out.println(context.getMessage("msg", null, germam));

        System.out.println(context.getMessage("nameMsg", new Object[]{"prerna", "verma"}, english));
        System.out.println(context.getMessage("nameMsg", new Object[]{"Arsh", "Thind"}, germam));

        context.close();
    }
}
