package com.paneraBread.repository;

import com.paneraBread.model.Recipe;

public interface RecipeRepository {

    boolean saveRecipe(Recipe recipe);
}
