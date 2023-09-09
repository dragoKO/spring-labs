package com.cydeo.loosely;

import lombok.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Balance {
    private UUID userId;
    private BigDecimal amount;

    public abstract BigDecimal addBalance(BigDecimal amount);
}
