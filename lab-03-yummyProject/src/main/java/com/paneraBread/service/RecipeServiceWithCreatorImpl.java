package com.paneraBread.service;

import com.github.javafaker.Faker;
import com.paneraBread.model.*;
import com.paneraBread.proxy.ShareService;
import com.paneraBread.repository.RecipeRepository;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Component
@ToString
public class RecipeServiceWithCreatorImpl implements RecipeService{
    private ShareService shareService;
    private RecipeRepository recipeRepository;
    private RecipeCreatorProperties recipeCreatorProperties;


    public RecipeServiceWithCreatorImpl( @Qualifier("FB")ShareService shareService, @Qualifier("ORACLE") RecipeRepository recipeRepository,RecipeCreatorProperties recipeCreatorProperties) {
        this.shareService = shareService;
        this.recipeRepository = recipeRepository;
        this.recipeCreatorProperties=recipeCreatorProperties;
    }

    @Override
    public boolean prepareRecipe() {


        Recipe recipe = new Recipe();

        recipe.setAccountId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(faker.random().nextInt(30, 60));
        recipe.setPreparation(randomPreparationType());

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


    @PreDestroy
    public void preDestroy() {
        System.out.println(recipeCreatorProperties);
    }
}
