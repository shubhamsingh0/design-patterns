
package com.shubhamsingh0.design.lld.designpatterns.creational.prototype;

import lombok.Generated;

public class PickupOrder extends Order {
    private String pickupLocation;
    private String pickupTime;

    public void addPickupOrder(String address, String time) {
        this.pickupLocation = address;
        this.pickupTime = time;
    }

    protected void resetState() {
        this.pickupLocation = null;
        this.pickupTime = null;
    }
}