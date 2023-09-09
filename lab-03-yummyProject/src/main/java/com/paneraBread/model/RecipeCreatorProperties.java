package com.paneraBread.model;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;


@ToString
@Component
@PropertySource("receiptsCreator.properties")
public class RecipeCreatorProperties {
    @Value("${name}")
    private String name;
    @Value("${surname}")
    private String surname;
    @Value("${email}")
    private String email;
    @Value("${socialMediaLinks}")
    private String socialMediaLinks;


}
