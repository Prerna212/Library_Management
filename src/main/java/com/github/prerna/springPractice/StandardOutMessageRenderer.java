package com.github.prerna.springPractice;

import javax.inject.Inject;
import javax.inject.Named;

public class StandardOutMessageRenderer implements MessageRenderer {

    @Inject
    @Named("provider")
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("set the messageprovider of class" + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
