package com.paneraBread;

import com.paneraBread.config.YummyConfig;
import com.paneraBread.model.RecipeCreatorProperties;
import com.paneraBread.service.RecipeServiceImpl;
import com.paneraBread.service.RecipeServiceWithCreatorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YummyApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(YummyConfig.class);

        for (int i = 0; i < 5; i++) {
            RecipeServiceImpl recipeServiceDefault = context.getBean(RecipeServiceImpl.class);
            recipeServiceDefault.prepareRecipe();
            System.out.println();
        }


        System.out.println("==================================================================");
        for (int i = 0; i < 5; i++) {
            RecipeServiceWithCreatorImpl recipeServiceWithCreator = context.getBean(RecipeServiceWithCreatorImpl.class);
            recipeServiceWithCreator.prepareRecipe();
            System.out.println();
        }
        ((AnnotationConfigApplicationContext)context).close(); // PreDestroy triggered
    }





}
