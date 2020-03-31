package com.github.prerna.tutorial.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

private Student student;

public Profile(Student student){
    System.out.println("profile constructor");
    this.student = student;
}


public void printAge(){
    System.out.println("Age :"+student.getAge());
}
public void printName(){
    System.out.println("Name :"+student.getName());
}
}
