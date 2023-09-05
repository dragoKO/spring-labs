package com.paneraBread;

import com.paneraBread.config.YummyConfig;
import com.paneraBread.service.RecipeServiceWithCreatorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YummyApp2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(YummyConfig.class);

        for (int i = 0; i < 5; i++) {
            RecipeServiceWithCreatorImpl recipeServiceWithCreator = context.getBean(RecipeServiceWithCreatorImpl.class);
            recipeServiceWithCreator.prepareRecipe();
            System.out.println();
        }
        ((AnnotationConfigApplicationContext)context).close();
    }
}
