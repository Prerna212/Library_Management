package com.github.prerna.books.config;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{     EmbeddedJdbcConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
