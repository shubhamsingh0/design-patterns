
package com.shubhamsingh0.design.lld.designpatterns.creational.prototype;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DeliveryOrder extends Order {
    private String deliveryAddress;
    private String deliveryTime;

    public void addDeliveryInfo(String address, String time) {
        this.deliveryAddress = address;
        this.deliveryTime = time;
    }

    protected void resetState() {
        this.deliveryAddress = null;
        this.deliveryTime = null;
    }
}