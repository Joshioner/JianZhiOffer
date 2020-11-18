package com.example.davie.code.Thread;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "callable Thread call() method...";
    }
}
