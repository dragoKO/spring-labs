package com.paneraBread.repository;


import com.paneraBread.model.Recipe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PostgreSQL")
public class PostgreSQLDBRecipeRepository implements RecipeRepository {
    @Override
    public boolean saveRecipe(Recipe recipe) {
        System.out.println("Store recipe in POSTGRES_SQL database: " + recipe);
        return true;
    }
}
