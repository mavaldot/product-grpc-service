package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Product {

    @NonNull
    private String name;
    @NonNull
    private String id;
    private double price;
    private double discountPercentage;
    private int quantity;



}
