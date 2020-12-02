package com.example.davie.code.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo extends Thread{
    private int num = 0;
    ReentrantLock reentrantLock = new ReentrantLock(true);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LockDemo demo = new LockDemo();
        for (int i = 0;i < 10;i++){
           executorService.execute(demo);
        }
        demo.wait();
    }

    public void run(){
        System.out.println("------" + Thread.currentThread().getName() + "抢到了锁-------");
        try {
            reentrantLock.tryLock(1, TimeUnit.SECONDS);
            System.out.println("------" + Thread.currentThread().getName() + "占用了锁-------");
            Thread.sleep(5000);
            num++;
            reentrantLock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
