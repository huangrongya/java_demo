package com.roya.demo.sync;

import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args) throws Exception {
        MyCallable callable = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(callable);
        Thread t1 = new Thread(ft);

        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);

        MyThread thread = new MyThread();
        Thread t3 = new Thread(thread);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(ft.get());

    }
}
