package com.samira.springdatajpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    private String name;
    private String productName;
    private int price;

    public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }
}
