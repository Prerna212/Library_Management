package com.github.prerna.springPractice;

public class    StandardMessageProvider implements MessageProvider{

    @Override
    public String getMessage()
    {
       return "Hello World";
    }
}
