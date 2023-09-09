package com.cydeo.config;


import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    Current current() {
        return new Current(
                new Currency("840", "USD"), new BigDecimal("100000.06"), UUID.randomUUID()
        );
    }

    @Bean
    Saving saving() {
        return new Saving(
                new Currency("978", "EURO"), new BigDecimal("100000.06"), UUID.randomUUID()
        );
    }
}
