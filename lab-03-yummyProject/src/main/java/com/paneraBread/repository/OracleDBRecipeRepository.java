package com.paneraBread.repository;


import com.paneraBread.model.Recipe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // this class dependency itself
@Primary
public class OracleDBRecipeRepository implements RecipeRepository {
    @Override
    public boolean saveRecipe(Recipe recipe) {
        System.out.println("Store recipe in Oracle database: " + recipe);
        return true;
    }
}
