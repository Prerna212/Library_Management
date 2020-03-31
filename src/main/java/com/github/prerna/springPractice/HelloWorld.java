package com.github.prerna.springPractice;

public class HelloWorld {
    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new StandardMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
