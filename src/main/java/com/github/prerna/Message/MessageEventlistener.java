package com.github.prerna.Message;

import org.springframework.context.ApplicationListener;

public class MessageEventlistener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        MessageEvent msgEvent = (MessageEvent) event;
        System.out.println("Received : "+ msgEvent.getMessage());
    }
}
