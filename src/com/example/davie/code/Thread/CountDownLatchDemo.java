package com.example.davie.code.Thread;

import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,1, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
        for (int i = 0;i < threadNum;i++){
            threadPoolExecutor.execute(()->{
                System.out.println("run...");
                countDownLatch.countDown();
            });
        }
       countDownLatch.await();
        System.out.println("end...");
        threadPoolExecutor.shutdown();
    }
}
