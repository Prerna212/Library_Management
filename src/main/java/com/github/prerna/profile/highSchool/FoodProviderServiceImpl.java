package com.github.prerna.profile.highSchool;

import com.github.prerna.profile.Food;
import com.github.prerna.profile.FoodProviderService;

import java.util.ArrayList;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService {

    @Override
    public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<>();
        lunchSet.add(new Food("Dal"));
        lunchSet.add(new Food("Roti"));
        lunchSet.add(new Food("Rice"));
        lunchSet.add(new Food("Sabji"));

        return lunchSet;
    }
}
