package com.neo.platform.effective.create.builder;

public class BuilderClient {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts =new  NutritionFacts.Builder(24,10).calories(2).carbohydrate(22).build();
    }
}
