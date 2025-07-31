
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Vehicle {
    private String maker;
    private String model;
    private String color;
    private String engineType;
    private String registrationNumber;

    public void start() {
        System.out.println("Starting Car...");
    }

    public void stop() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stopping Car...");
        System.out.println("Stop");
    }
}
