package com.paneraBread.service;

import com.github.javafaker.Faker;
import com.paneraBread.model.Ingredient;
import com.paneraBread.model.QuantityType;
import com.paneraBread.model.Recipe;
import com.paneraBread.model.RecipeType;
import com.paneraBread.proxy.ShareService;
import com.paneraBread.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private ShareService shareService;
    private RecipeRepository recipeRepository;

    @Override
    public boolean prepareRecipe() {
        Faker faker = new Faker();

        Recipe recipe = new Recipe();

        recipe.setAccountId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(faker.random().nextInt(30, 60));
        recipe.setPreparation("Grilled");

        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < faker.random().nextInt(1, 25); i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(faker.random().nextInt(0, 100));
            ingredient.setQuantityType(
                    QuantityType.values()
                            [faker.random()
                            .nextInt(0, QuantityType.values().length - 1)]
            );
            ingredients.add(ingredient);
        }

        recipe.setIngredients(ingredients);
        recipe.setRecipeType(RecipeType.values()
                [faker.random()
                .nextInt(0, QuantityType.values().length - 1)]);

        recipeRepository.saveRecipe(recipe);
        shareService.share(recipe);


        return true;
    }
}
