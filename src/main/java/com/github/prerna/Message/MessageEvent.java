package com.github.prerna.Message;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {
    private String msg;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MessageEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
    public String getMessage(){
        return msg;
    }
}
