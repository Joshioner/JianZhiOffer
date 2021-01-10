package com.example.davie.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 双线程打印 12 A a 34 B b 56 C
 */
public class ThreadDemo2 {
    private ReentrantLock reentrantLock = new ReentrantLock();
    private int num = 1;
    private char en = 'A';
    private char smallEn = 'a';
    private Condition conditionA = reentrantLock.newCondition();
    private Condition conditionB = reentrantLock.newCondition();
    private Condition conditionC = reentrantLock.newCondition();

    public void printNum(){
        reentrantLock.lock();
        try {
           while (num <= 52){
               for (int i = 0;i < 2;i++){
                   System.out.printf(num+"");
                   num++;
               }
               conditionB.signal();
               conditionA.await();
           }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }

    }

    public void printEn(){
        reentrantLock.lock();
        try {
            while (en <= 'Z'){
                System.out.printf(en+"");
                en++;
                conditionC.signal();
                conditionB.await();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }

    public void printSmallEn(){
        reentrantLock.lock();
        try {
            while (smallEn <= 'z'){
                System.out.printf(smallEn+"");
                smallEn++;
                conditionA.signal();
                conditionC.await();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }
    public static void main(String[] args) {
        ThreadDemo2 demo = new ThreadDemo2();

        new Thread(demo::printEn,"B").start();
        new Thread(demo::printSmallEn,"C").start();
        new Thread(demo::printNum,"A").start();
    }
}
