package com.example.davie.code.interfaceDefault;

public interface A {
    default void test(){
        System.out.println("---- test A");
    }
}
