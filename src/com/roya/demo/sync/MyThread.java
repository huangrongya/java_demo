package com.roya.demo.sync;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("my thread");
        super.run();
    }
}
