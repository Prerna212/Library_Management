package com.github.prerna.profile.config;

import com.github.prerna.profile.FoodProviderService;
import com.github.prerna.profile.highSchool.FoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("highSchool")
public class HighSchoolConfig {

    @Bean
    public FoodProviderService foodProviderService(){
        return new FoodProviderServiceImpl();
    }
}
