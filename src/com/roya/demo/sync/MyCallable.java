package com.roya.demo.sync;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private MyThread thread;
    @Override
    public String call() throws Exception {
        System.out.println("run my callable");
        thread.join();
        return "my callable";
    }

    public MyCallable(MyThread thread) {
        this.thread = thread;
    }
}
