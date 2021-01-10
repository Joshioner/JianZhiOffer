package com.example.davie.code.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {
    public synchronized void before() throws InterruptedException {
        System.out.println("before");
        notifyAll();
        Thread.sleep(5000);
        System.out.println("==============");
    }

    public synchronized void after() {
        try {
            wait();
            System.out.println("------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.after());
        executorService.execute(() -> {
            try {
                example.before();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
    }
}
