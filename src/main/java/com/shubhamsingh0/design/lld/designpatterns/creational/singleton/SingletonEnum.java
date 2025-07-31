
package com.shubhamsingh0.design.lld.designpatterns.creational.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public enum SingletonEnum {
    INSTANCE;

    private final Executor pool = Executors.newFixedThreadPool(1);

    private SingletonEnum() {
    }

    public Executor getInstance() {
        return this.pool;
    }
}
