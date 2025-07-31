
package com.shubhamsingh0.design.lld.designpatterns.creational.singleton;

public class LazyInitializationHolder {
    private LazyInitializationHolder() {
    }

    public static LazyInitializationHolder getInstance() {
        return LazyInitializationHolder.LazyInitializationContextHolder.INSTANCE;
    }

    private static class LazyInitializationContextHolder {
        public static LazyInitializationHolder INSTANCE = new LazyInitializationHolder();

        private LazyInitializationContextHolder() {
        }
    }
}