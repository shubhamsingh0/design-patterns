package com.shubhamsingh0.design.lld.designpatterns.structural.decorator.normal_example;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {

//        The decorator pattern solves the problem of adding new functionality to objects dynamically
//        without altering their structure. It allows behavior to be extended or modified at runtime
//        by wrapping objects with decorator classes, promoting flexibility and adherence to the
//        Open/Closed Principle. This avoids subclass explosion and keeps code maintainable.

        ExposedInterface exposedInterface = new ConcreteClass("shubham","singh",
                LocalDate.of(2000,2,12));
        ExposedInterface nameDecorator = new UpperCaseDecorator(exposedInterface);
        ExposedInterface ageDecorator = new AgeDecorator(nameDecorator);
        System.out.println(exposedInterface);
        System.out.println(nameDecorator);
        System.out.println(ageDecorator);
    }
}
