
package com.shubhamsingh0.design.lld.designpatterns.creational.singleton;

public class LazyInitializationDoubleCheck {
    private static volatile LazyInitializationDoubleCheck INSTANCE;

    private LazyInitializationDoubleCheck() {
    }

    public static LazyInitializationDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized(LazyInitializationDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyInitializationDoubleCheck();
                }
            }
        }

        return INSTANCE;
    }
}
