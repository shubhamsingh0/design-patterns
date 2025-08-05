package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.vehicle;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bike implements Vehicle {
    private String make;
    private String model;
    private int gearCount;
    private String type;
    private String frameMaterial;

    public void start() {
        System.out.println("Starting Bike...");
    }

    public void stop() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stopping Bike...");
        System.out.println("Stop");
    }
}