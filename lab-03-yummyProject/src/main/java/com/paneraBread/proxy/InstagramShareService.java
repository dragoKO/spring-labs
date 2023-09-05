package com.paneraBread.proxy;

import com.paneraBread.model.Recipe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("INSTAGRAM")
public class InstagramShareService implements ShareService {
    @Override
    public void share(Recipe recipe) {
        System.out.println("Shared to INSTAGRAM: "+recipe);
    }
}
