package com.example.davie.code.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //ThreadPoolExecutor 模式
        /**
         * newCachedThreadPool
         * 核心线程数为0
         * 最大线程数为最大上限
         * 空闲等待时间为60s
         * 队列：不存储元素
         * 原理：每来一个任务，都会创建一个线程去处理，容易造成OOM
         */
        ExecutorService cacheThreadPool = Executors.newCachedThreadPool();
//        for (int i = 0;i < 100;i++){
//            cacheThreadPool.execute(()->{
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("-----" + Thread.currentThread().getName() + "-----" + Thread.activeCount());
//            });
//        }
        /**
         * newSingleThreadExecutor
         * 核心线程数为1
         * 最大线程数为1
         * 空闲等待时间为0
         * 等待队列为LinkedBlockingQueue,可存放无限任务，容易造成OOM
         */
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
//        for (int i = 0;i < 100;i++){
//            singleThreadPool.execute(()->{
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("-----" + Thread.currentThread().getName() + "-----" + Thread.activeCount());
//            });
//        }
        /**
         * newFixedThreadPool
         * 核心线程数为 n
         * 最大线程数为 n
         * 空闲等待时间为 0
         * 等待队列 LinkedBlockingQueue，无界队列，容易造成OOM
         */
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(20);
//        for (int i = 0;i < 100;i++){
//            fixedThreadPool.execute(()->{
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("-----" + Thread.currentThread().getName() + "-----" + Thread.activeCount());
//            });
//        }
        /**
         * newScheduledThreadPool
         * 核心线程数 n
         * 最大线程数 Integer.MAX_VALUE
         * 空闲等待时间 0
         * 队列：延迟队列，容易造成OOM
         * schedule(延迟的时间)
         * scheduleAtFixedRate（延迟一定时间后，按照上一次任务的发起时间计算下一次任务的开始时间）
         * scheduleWithFixedDelay（延迟一定时间后，以上一次任务的结束时间计算下一次任务的开始时间）
         */
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(20);
//        for (int i = 0;i < 100;i++){
//            scheduledThreadPool.scheduleAtFixedRate(()->{
////                try {
////                    Thread.sleep(2000);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//                System.out.println("-----" + Thread.currentThread().getName() + "-----" + Thread.activeCount() + "-------" + System.currentTimeMillis() / 1000);
//            },5,1, TimeUnit.SECONDS);
//        }
        /**
         * newWorkStealingPool 会创建一个含有足够多线程的线程池，来维持相应的并行级别，
         * 它会通过工作窃取的方式，使得多核的 CPU 不会闲置，总会有活着的线程让 CPU 去运行。
         * 原理：为每个工作者程分配一个双端队列(本地队列)用于存放需要执行的任务，当自己的队列没有数据的时候从其它工作者队列中获得一个任务继续执行。
         * 并发安全问题避免：
         * 一般是自己的本地队列采取LIFO(后进先出)，偷取时采用FIFO(先进先出)，一个从头开始执行，一个从尾部开始执行，
         * 由于偷取的动作十分快速，会大量降低这种冲突，也是一种优化方式
         */
        ExecutorService workStealingPool = Executors.newWorkStealingPool(10);
       // System.out.println(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 100; i++) {
//            int finalI = i;
            workStealingPool.execute(() -> {
                System.out.println("-----" + Thread.currentThread().getName() + "-----" + Thread.activeCount() + "-------" + System.currentTimeMillis() / 1000);
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }
    }
}
