
package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method;

public interface Vehicle {
    // product interface or abstract class should only contain behaviour common to all products impl
    // it should not have any creation logic or behaviour, all creation logic should be in the factory implementation
    void start();

    void stop();
}
