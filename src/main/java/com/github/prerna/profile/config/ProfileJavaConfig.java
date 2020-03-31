package com.github.prerna.profile.config;

import com.github.prerna.profile.Food;
import com.github.prerna.profile.FoodProviderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class ProfileJavaConfig {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(KindergartenConfig.class, HighSchoolConfig.class);

        FoodProviderService foodProviderService = context.getBean("foodProviderService", FoodProviderService.class);

        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for(Food food : lunchSet){
            System.out.println("Food : "+ food.getName());
        }
    }
}
