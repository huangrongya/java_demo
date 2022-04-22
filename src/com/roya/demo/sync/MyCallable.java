package com.roya.demo.sync;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("run my callable");
        return "my callable";
    }
}
