package com.shubhamsingh0.design.lld.designpatterns.creational.abstract_factory_method;

public class AudiCarFactory implements VolkswagenCarFactory {
    @Override
    public VolkswagenCar createCar() {
        return new AudiA4();
    }

    @Override
    public VolkswagenEngine createEngine() {
        return new AudiCarEngine();
    }

    @Override
    public VolkswagenTire createTire() {
        return new AudiCarTire();
    }

    @Override
    public VolkswagenChassis createChassis() {
        return new AudiCarChassis();
    }
}
