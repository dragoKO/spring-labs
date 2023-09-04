package com.paneraBread;

import com.paneraBread.config.YummyConfig;
import com.paneraBread.service.RecipeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YummyApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(YummyConfig.class);

        for (int i = 0; i < 10; i++) {
            RecipeServiceImpl recipeServiceDefault = context.getBean(RecipeServiceImpl.class);
            recipeServiceDefault.prepareRecipe();
            System.out.println();
        }



    }
}
