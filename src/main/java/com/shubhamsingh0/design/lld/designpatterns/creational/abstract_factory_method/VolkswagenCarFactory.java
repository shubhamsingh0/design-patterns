package com.shubhamsingh0.design.lld.designpatterns.creational.abstract_factory_method;

public interface VolkswagenCarFactory {

    VolkswagenCar createCar();

    VolkswagenEngine createEngine();

    VolkswagenTire createTire();

    VolkswagenChassis createChassis();

    static VolkswagenCarFactory getCarFactory(String carType) {
        return switch (carType) {
            case "audi" -> new AudiCarFactory();
            case "bugatti" -> new BugattiCarFactory();
            case "lamborghini" -> new LamborghiniCarFactory();
            default -> throw new IllegalArgumentException("No such car factory established till now by Volkswagen");
        };
    }
}
