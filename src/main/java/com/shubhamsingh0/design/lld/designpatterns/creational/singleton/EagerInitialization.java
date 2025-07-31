
package com.shubhamsingh0.design.lld.designpatterns.creational.singleton;

public class EagerInitialization {
    private static final EagerInitialization SINGLETON_INSTANCE = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return SINGLETON_INSTANCE;
    }
}
