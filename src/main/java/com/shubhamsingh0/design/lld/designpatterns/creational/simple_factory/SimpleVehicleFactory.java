
package com.shubhamsingh0.design.lld.designpatterns.creational.simple_factory;

public class SimpleVehicleFactory {
    public SimpleVehicleFactory() {
    }

    public static Vehicle getVehicle(String type) {
        Object var10000;
        switch (type) {
            case "CAR" -> var10000 = new Car();
            case "BUS" -> var10000 = new Bus();
            default -> var10000 = new NoVehicle();
        }

        return (Vehicle)var10000;
    }
}
