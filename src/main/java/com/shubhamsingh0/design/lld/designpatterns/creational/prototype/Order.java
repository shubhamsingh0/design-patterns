
package com.shubhamsingh0.design.lld.designpatterns.creational.prototype;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
// Order is a prototype class
public abstract class Order implements Cloneable {
    private String orderId;
    private List<Item> items;
    private boolean isPaymentDone;
    private int version;

    public Order clone() {
        try {
            Order clone = (Order) super.clone();
            // Initialize the state of the prototype class depending on shallow or deep copy requirements
            initializeStateOfPrototypeClass(clone);
            // To reset or initialize any child state, it should be handled by the child class
            clone.resetState();
            return clone;
        } catch (CloneNotSupportedException var2) {
            throw new AssertionError();
        }
    }

    private void initializeStateOfPrototypeClass(Order clone) {
        if (this.items != null) {
            clone.items = this.items.stream().map((item) ->
                    new Item(item.getItemId(), item.getItemName(), item.getPrice(),
                            item.getDescription(), item.getQuantity())).toList();
        }
        // Resetting the payment status and incrementing the version for the cloned order
        clone.isPaymentDone = false;
        clone.version = this.version + 1;
    }

    protected abstract void resetState();
}