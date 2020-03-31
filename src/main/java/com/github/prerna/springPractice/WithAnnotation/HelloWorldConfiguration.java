package com.github.prerna.springPractice.WithAnnotation;
import com.github.prerna.springPractice.StandardOutMessageRenderer;
import com.github.prerna.springPractice.StandardMessageProvider;
import com.github.prerna.springPractice.MessageRenderer;
import com.github.prerna.springPractice.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@Import(AppConfig.class)
public class HelloWorldConfiguration {

    @Autowired
    MessageProvider provider;

   /* @Bean
    public MessageProvider provider(){
        return new StandardMessageProvider();
    }
*/
    @Bean(name = "renderer")
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider);
        return renderer;
    }
}
