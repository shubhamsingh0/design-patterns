
package com.shubhamsingh0.design.lld.designpatterns.creational.prototype;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        DeliveryOrder order = new DeliveryOrder();
        order.setOrderId("12345");
        List<Item> items = new ArrayList<Item>() {
            {
                this.add(new Item("1", "Pizza", 12.99, "Cheese Pizza", 2));
                this.add(new Item("2", "Burger", 8.99, "Veg Burger", 1));
            }
        };
        order.setItems(items);
        order.setVersion(1);
        order.setPaymentDone(true);
        order.addDeliveryInfo("123 Main St", "2023-10-01 18:00");
        order.setDeliveryTime(Instant.now().plus(1L, ChronoUnit.DAYS).toString());
        System.out.println(order);
        DeliveryOrder toBeRetried = (DeliveryOrder)order.clone();
        System.out.println(toBeRetried);
    }
}