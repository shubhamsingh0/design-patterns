package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.thread_pool_example;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends Thread {
    private final BlockingQueue<Runnable> taskQueue;

    public WorkerThread(BlockingQueue<Runnable> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Runnable task = taskQueue.take();
                task.run();
            }
        } catch (InterruptedException e) {
            // Thread interrupted, exit
        }
    }
}