
package com.shubhamsingh0.design.lld.designpatterns.creational.singleton;

public class LazyInitialization {
    private static LazyInitialization LAZY_INSTANCE;

    private LazyInitialization() {
    }

    public static synchronized LazyInitialization getInstance() {
        if (LAZY_INSTANCE == null) {
            LAZY_INSTANCE = new LazyInitialization();
        }

        return LAZY_INSTANCE;
    }
}