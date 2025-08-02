package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.bitmap_pool_exmaple;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Image> {
    private BlockingQueue<T> pool;

    public ObjectPool(Supplier<T> supplier, int size) {
        pool = new LinkedBlockingQueue<>();
        for(int i = 0; i < size; i++) {
            pool.offer(supplier.get());
        }
    }

    public T get() {
        try {
            return pool.take();
        } catch (InterruptedException e) {
            System.out.println("Failed to get object from pool");
        }
        return null;
    }

    public void release(T object) {
        object.reset();
        try {
            pool.put(object);
        } catch (InterruptedException e) {
            System.out.println("Failed to release object back to pool");
        }
    }
}
