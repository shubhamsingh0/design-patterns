package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.thread_pool_example;

public class Client {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(3); // pool with 3 threads

        // Submit 5 sample tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            pool.submit(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Optional: shutdown after some time
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        pool.shutdown();
    }
}
