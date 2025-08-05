
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.vehicle;

public class CarFactory implements VehicleFactory {
    public CarFactory() {
    }

    public Vehicle createVehicle() {
        return new Car("Audi", "A8", "Black", "v12", "KA UY 9856");
    }
}
