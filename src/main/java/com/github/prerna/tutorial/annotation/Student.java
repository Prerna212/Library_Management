package com.github.prerna.tutorial.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {

    private String name;
    private Integer age;

    public Student(){
        System.out.println("inside Student Constructor");
    }
    public String getName() {
        System.out.println("Inside getName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        System.out.println("Inside getAge");
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
