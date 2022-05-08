package com.roya.demo.juc;

public class MyThread extends Thread {

    @Override
    public void run() {
        synchronized (this){
            System.out.println("before notify...");
            notify();
            System.out.println("after notify...");
        }
    }
}
