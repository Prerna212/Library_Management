package com.github.prerna.springPractice.WithAnnotation;

import com.github.prerna.springPractice.MessageProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

//@Service("provider")
@Named("provider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    @Inject
    @Named("message")
    public ConfigurableMessageProvider(){
         //   @Value("Love cvdevijvo") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
