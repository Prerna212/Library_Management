package com.github.prerna.tutorial;

public class HelloWorld {
    private String message;
    private String message1;

 private HelloIndia helloIndia;
 private String name;

 public void setHelloIndia(HelloIndia helloIndia){
     System.out.println("inside setter method");
     this.helloIndia = helloIndia;
 }
 public HelloIndia getHelloIndia(){
     return helloIndia;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("inside setName ");
        this.name = name;
    }
public void checkWorld(){
    helloIndia.checkInIndia();
}



/*   public void setMessage(String message) {
        this.message = message;
    }

     public void getMessage() {
        System.out.println("Your Message " + message);
    }

    public void setMessage1(String message1){
        this.message1= message1;
    }

    public void getMessage1(){
        System.out.println("Message1 is:" + message1);
    }

   /* public void initMethod() {
        System.out.println("Bean getting intialized");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }*/

}
