
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus implements Vehicle {
    private String company;
    private String model;
    private int seatingCapacity;
    private String routeNumber;
    private String registrationNumber;

    public void start() {
        System.out.println("Starting Bus...");
    }

    public void stop() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stopping Bus...");
        System.out.println("Stop");
    }
}
