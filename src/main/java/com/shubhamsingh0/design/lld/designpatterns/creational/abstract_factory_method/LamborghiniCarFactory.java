package com.shubhamsingh0.design.lld.designpatterns.creational.abstract_factory_method;

public class LamborghiniCarFactory implements VolkswagenCarFactory {
    @Override
    public VolkswagenCar createCar() {
        return new LamborghiniAventador();
    }

    @Override
    public VolkswagenEngine createEngine() {
        return new LamborghiniCarEngine();
    }

    @Override
    public VolkswagenTire createTire() {
        return new LamborghiniCarTire();
    }

    @Override
    public VolkswagenChassis createChassis() {
        return new LamborghiniCarChassis();
    }
}

