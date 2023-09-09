package com.cydeo.account;

import com.cydeo.Currency;
import lombok.*;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
public class Current {

    private Currency currency;
    private BigDecimal amount;
    private UUID accountId;

    public void initialize(){
        System.out.println("savings account " + "currency: "+currency.getName()+" "+ currency.getCode() + " amount: " + amount + " accountId: " + accountId);
    }
}
