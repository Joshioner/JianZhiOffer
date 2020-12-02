package com.example.davie.code.Thread;

import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadUnsafeDemo {
//    private int cnt = 0;
//    public void add(){
//        cnt++;
//    }
//    public int getCnt(){
//        return this.cnt;
//    }
    //修改为线程安全的
    private AtomicInteger atomicInteger = new AtomicInteger();
    public void add(){
        atomicInteger.incrementAndGet();
    }

    public int getCnt(){
        return atomicInteger.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadUnsafeDemo demo = new ThreadUnsafeDemo();
        //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,1, TimeUnit.SECONDS,new ArrayBlockingQueue<>(50),new ThreadPoolExecutor.CallerRunsPolicy());
        ExecutorService executorService = Executors.newCachedThreadPool();
        int threadNum = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int  i = 0;i < threadNum;i++){
            executorService.execute(()->{
                countDownLatch.countDown();
                demo.add();
            });
        }
        countDownLatch.await();
        System.out.println(demo.getCnt());
        executorService.shutdown();
    }
}
