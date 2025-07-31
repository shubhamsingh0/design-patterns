
package com.shubhamsingh0.design.lld.designpatterns.creational.singleton;

import java.util.concurrent.Executor;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization1);
        System.out.println(eagerInitialization2);
        LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
        System.out.println(lazyInitialization1);
        System.out.println(lazyInitialization2);
        LazyInitializationDoubleCheck lazyInitializationDoubleCheck1 = LazyInitializationDoubleCheck.getInstance();
        LazyInitializationDoubleCheck azyInitializationDoubleCheck2 = LazyInitializationDoubleCheck.getInstance();
        System.out.println(lazyInitializationDoubleCheck1);
        System.out.println(azyInitializationDoubleCheck2);
        LazyInitializationHolder lazyInitializationHolder1 = LazyInitializationHolder.getInstance();
        LazyInitializationHolder lazyInitializationHolder2 = LazyInitializationHolder.getInstance();
        System.out.println(lazyInitializationHolder1);
        System.out.println(lazyInitializationHolder2);
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        Executor executor = singletonEnum.getInstance();
    }
}