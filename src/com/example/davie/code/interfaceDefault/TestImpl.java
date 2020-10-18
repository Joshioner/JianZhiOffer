package com.example.davie.code.interfaceDefault;

public class TestImpl implements A,B{
    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        test.test();

    }


    @Override
    public void test() {
        A.super.test();
    }
}
