
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method;

public class BusFactory implements VehicleFactory {
    public BusFactory() {
    }

    public Vehicle createVehicle() {
        return new Bus("Tata", "Primo", 20, "KA34", "KA BC 1234");
    }
}
