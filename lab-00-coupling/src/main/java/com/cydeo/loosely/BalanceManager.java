package com.cydeo.loosely;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class BalanceManager {

    public boolean checkout(Balance balance, BigDecimal checkoutAmount) {

        BigDecimal customerBalanceAmount = balance.getAmount();
        return customerBalanceAmount.subtract(checkoutAmount)
                .compareTo(BigDecimal.ZERO) >= 0;
    }
}
