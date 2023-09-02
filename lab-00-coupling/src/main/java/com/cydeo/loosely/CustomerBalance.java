package com.cydeo.loosely;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class CustomerBalance extends Balance {
    @Override
    public BigDecimal addBalance(BigDecimal amount) {
        setAmount(getAmount().add(amount));
        return getAmount();
    }
}