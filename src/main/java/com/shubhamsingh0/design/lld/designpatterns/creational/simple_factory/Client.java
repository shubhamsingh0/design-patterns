
package com.shubhamsingh0.design.lld.designpatterns.creational.simple_factory;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Vehicle vehicle = SimpleVehicleFactory.getVehicle("BUS");
        System.out.println(vehicle.getVehicleType());
    }
}
