package com.roya.demo.sync;

import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread();
        MyCallable callable = new MyCallable(thread);
        FutureTask<String> ft = new FutureTask<>(callable);
        Thread t1 = new Thread(ft);

        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);

        Thread t3 = new Thread(thread);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(ft.get());

    }
}
