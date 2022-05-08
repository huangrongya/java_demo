package com.roya.demo.juc;

import java.util.concurrent.locks.LockSupport;

public class LockSupportThread  extends Thread{

    private Object object;

    public LockSupportThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
//        System.out.println("before unpark...");
//        LockSupport.unpark((Thread) object);
//        System.out.println("after unpark...");
        Thread.interrupted();
    }
}
