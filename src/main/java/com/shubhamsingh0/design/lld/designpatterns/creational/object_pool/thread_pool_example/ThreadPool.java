package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.thread_pool_example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    private final BlockingQueue<Runnable> taskQueue;
    private final WorkerThread[] workers;

    public ThreadPool(int capacity) {
        this.taskQueue = new LinkedBlockingQueue<>();
        this.workers = new WorkerThread[capacity];
        for (int i = 0; i < capacity; i++) {
            workers[i] = new WorkerThread(taskQueue);
            workers[i].start();
        }
    }

    public void submit(Runnable task) {
        taskQueue.offer(task);
    }

    // Optional: shutdown method
    public void shutdown() {
        for (WorkerThread worker : workers) {
            worker.interrupt();
        }
    }
}
