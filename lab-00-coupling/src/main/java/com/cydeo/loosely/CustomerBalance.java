package com.cydeo.loosely;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;


public class CustomerBalance extends Balance {
    public CustomerBalance(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    @Override
    public BigDecimal addBalance(BigDecimal amount) {
        setAmount(getAmount().add(amount));
        return getAmount();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
