package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.vehicle;

public class BikeFactory implements VehicleFactory {
    public BikeFactory() {
    }

    public Vehicle createVehicle() {
        return new Bike("Honda", "Unicorn 160", 6, "road", "aluminium");
    }
}
