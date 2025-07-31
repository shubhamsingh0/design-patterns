package com.shubhamsingh0.design.lld.designpatterns.creational.prototype;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String itemId;
    private String itemName;
    private double price;
    private String description;
    private int quantity;

}