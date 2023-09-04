package com.paneraBread.proxy;

import com.paneraBread.model.Recipe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FacebookShareService implements ShareService {
    @Override
    public void share(Recipe recipe) {
        System.out.println("Shared to INSTAGRAM: "+recipe);
    }
}
