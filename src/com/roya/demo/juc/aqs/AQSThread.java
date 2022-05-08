package com.roya.demo.juc.aqs;

import java.util.concurrent.locks.Lock;

public class AQSThread extends Thread{

    Lock lock;

    public AQSThread(String name, Lock lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread()+" is running");
        } finally {
            lock.unlock();
        }
    }
}
