package com.shubhamsingh0.design.lld.designpatterns.creational.abstract_factory_method;

public class Client {
    public static void main(String[] args) {
//     The abstract factory pattern is used to create families of related objects (like car parts) without specifying their concrete classes.
        System.out.println(getCar("audi"));
    }

    public static VolkswagenCar getCar(String carType) {
        VolkswagenCarFactory vehicleFactory = VolkswagenCarFactory.getCarFactory(carType); // Simple Factory Method + Abstract Factory Method
        VolkswagenCar volkswagenCar = vehicleFactory.createCar();
        VolkswagenChassis volkswagenChassis = vehicleFactory.createChassis();
        VolkswagenEngine volkswagenEngine = vehicleFactory.createEngine();
        VolkswagenTire volkswagenTire = vehicleFactory.createTire();

        volkswagenCar.setVolkswagenChassis(volkswagenChassis);
        volkswagenCar.setVolkswagenEngine(volkswagenEngine);
        volkswagenCar.setVolkswagenTire(volkswagenTire);

        return volkswagenCar;
    }



}
