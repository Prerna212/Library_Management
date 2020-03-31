package com.github.prerna.tutorial.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring/BeanAnnotation.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printName();;
        profile.printAge();
        */
       ApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);

       /*
       Student student = context.getBean(Student.class);
       student.setName("Prerna");
        System.out.println(student.getName());
        student.setAge(24);
        System.out.println(student.getAge());
        */
       Student student = context.getBean(Student.class);
       student.setAge(22);
       student.setName("Prerna");
        Profile profile = context.getBean(Profile.class);
        profile.printAge();
        profile.printName();
    }
}
