
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        VehicleFactory vehicleFactory1 = new BusFactory();
        VehicleFactory vehicleFactory2 = new CarFactory();
        VehicleFactory vehicleFactory3 = new BikeFactory();
        System.out.println(vehicleFactory1.testVehicle());
        System.out.println(vehicleFactory2.testVehicle());
        System.out.println(vehicleFactory3.testVehicle());
    }
}
