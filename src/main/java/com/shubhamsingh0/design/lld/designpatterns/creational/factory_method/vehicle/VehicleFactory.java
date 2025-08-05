
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.vehicle;

public interface VehicleFactory {
    default Vehicle testVehicle() {
        Vehicle vehicle = this.createVehicle();
        vehicle.start();
        vehicle.stop();
        return vehicle;
    }

    Vehicle createVehicle();
}
