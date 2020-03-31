package com.github.prerna.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("hello");
        objA.checkWorld();

       /* objA.getMessage();
        objA.getMessage1();

        HelloIndia objB = (HelloIndia) context.getBean( "India");
        objB.getMessage();
        objB.getMessage1();
        objB.getMessage2();

*/
       // context.registerShutdownHook();
//java collection
        /*
      JavaCollection collection = (JavaCollection) context.getBean("javaCollection");
      collection.getAddressList();
      collection.getAddressMap();
      collection.getAddressSet();
      collection.getAddressProp();
*/
    }
}
