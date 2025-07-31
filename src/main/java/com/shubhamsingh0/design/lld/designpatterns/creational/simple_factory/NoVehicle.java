
package com.shubhamsingh0.design.lld.designpatterns.creational.simple_factory;

public class NoVehicle extends Vehicle {
    public NoVehicle() {
    }

    public String getVehicleType() {
        return "Invalid Vehicle type";
    }
}
