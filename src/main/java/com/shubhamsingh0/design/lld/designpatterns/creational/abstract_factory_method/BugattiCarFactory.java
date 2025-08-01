package com.shubhamsingh0.design.lld.designpatterns.creational.abstract_factory_method;

public class BugattiCarFactory implements VolkswagenCarFactory{
    @Override
    public VolkswagenCar createCar() {
        return new BugattiVeyron();
    }

    @Override
    public VolkswagenEngine createEngine() {
        return new BugattiCarEngine();
    }

    @Override
    public VolkswagenTire createTire() {
        return new BugattiCarTire();
    }

    @Override
    public VolkswagenChassis createChassis() {
        return new BugattiCarChassis();
    }
}
