package com.shubhamsingh0.design.lld.designpatterns.structural.decorator.normal_example;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        ExposedInterface exposedInterface = new ConcreteClass("shubham","singh", LocalDate.of(2000,2,12));
        ExposedInterface nameDecorator = new UpperCaseDecorator(exposedInterface);
        ExposedInterface ageDecorator = new AgeDecorator(nameDecorator);
        System.out.println(exposedInterface);
        System.out.println(nameDecorator);
        System.out.println(ageDecorator);
    }
}
