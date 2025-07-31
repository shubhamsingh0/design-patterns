
package com.shubhamsingh0.design.lld.designpatterns.creational.simple_factory;

public abstract class Vehicle {
    private String type;
    private int wheels;
    private boolean withEngine;
    private String size;

    public Vehicle() {
    }

    public abstract String getVehicleType();
}
