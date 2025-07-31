
package com.shubhamsingh0.design.lld.designpatterns.creational.prototype;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Order implements Cloneable {
    private String orderId;
    private List<Item> items;
    private boolean isPaymentDone;
    private int version;

    public Order clone() {
        try {
            Order clone = (Order) super.clone();
            if (this.items != null) {
                clone.items = this.items.stream().map((item) -> new Item(item.getItemId(), item.getItemName(), item.getPrice(), item.getDescription(), item.getQuantity())).toList();
            }

            clone.isPaymentDone = false;
            clone.version = this.version + 1;
            clone.resetState();
            return clone;
        } catch (CloneNotSupportedException var2) {
            throw new AssertionError();
        }
    }

    protected abstract void resetState();
}