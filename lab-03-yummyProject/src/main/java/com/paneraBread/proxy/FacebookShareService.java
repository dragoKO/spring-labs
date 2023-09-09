package com.paneraBread.proxy;

import com.paneraBread.model.Recipe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("FB")
public class FacebookShareService implements ShareService {
    @Override
    public void share(Recipe recipe) {
        System.out.println("Shared to FACEBOOK: "+recipe);
    }
}
