package com.paneraBread.repository;


import com.paneraBread.model.Recipe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ORACLE")
public class OracleDBRecipeRepository implements RecipeRepository {
    @Override
    public boolean saveRecipe(Recipe recipe) {
        System.out.println("Store recipe in ORACLE database: " + recipe);
        return true;
    }
}
