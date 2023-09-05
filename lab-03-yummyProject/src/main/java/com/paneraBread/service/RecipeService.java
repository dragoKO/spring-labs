package com.paneraBread.service;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface RecipeService {
    List<String> preparationTypes = Arrays.asList(
            "Grilled", "Baked", "Fried", "Boiled", "Steamed", "Sauteed", "Roasted"
    );

    Faker faker = new Faker();

    boolean prepareRecipe();

    default String randomPreparationType() {
        int randomIndex = faker.random().nextInt(preparationTypes.size());
        return preparationTypes.get(randomIndex);
    }
}
