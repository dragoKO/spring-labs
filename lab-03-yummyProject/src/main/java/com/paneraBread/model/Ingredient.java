package com.paneraBread.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ingredient {
    private String name;
    private int quantity;
    private QuantityType quantityType;
}
