package com.example.davie.code.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadDemo extends Thread{
    public static void main(String[] args) throws InterruptedException {
//        //实现runnable接口，无返回值
//        Thread runThread = new Thread(()->{
//            System.out.println("runnable thread run() method...");
//        });
//        runThread.start();
//
//        //实现callable接口，有返回值（底层也是调用run方法）
//        CallableThread callableTask = new CallableThread();
//        FutureTask<String> futureTask = new FutureTask<>(callableTask);
//        Thread callThread =  new Thread(futureTask);
//        callThread.start();
//        try {
//            System.out.println(futureTask.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//
//        //继承Thread类
//        ThreadDemo demo = new ThreadDemo();
//        demo.start();
        Thread demo = new Thread(()->{
            System.out.println("test...");
        });
        demo.start();
        System.out.println(demo.isInterrupted());
        demo.interrupt();


    }

    @Override
    public void run() {
        System.out.println("extends thread demo run() method...");
    }
}
