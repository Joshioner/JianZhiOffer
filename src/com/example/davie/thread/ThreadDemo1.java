package com.example.davie.thread;

import com.example.davie.code.Thread.ThreadDemo;

import java.io.ObjectOutput;

/**
 * 两个线程打印
 * 12 A  34 B  56 C
 */
public class ThreadDemo1 {
    private Object object = new Object();
    private int num = 1;
    private char en = 'A';
    public void printNum(){
        synchronized (object){
            while (num <= 52){
                for (int i = 0;i < 2;i++){
                    System.out.printf(num + "");
                    num++;
                }
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printEn(){
        synchronized (object){
            while (en <= 'Z'){
                System.out.printf(en+"");
               // System.out.println();
                en++;
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 demo = new ThreadDemo1();
        new Thread(demo::printNum,"A").start();
        new Thread(demo::printEn,"B").start();

    }
}
