package com.roya.demo.juc.aqs;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AQSDemo {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        AQSThread t1 = new AQSThread("t1", lock);
        AQSThread t2 = new AQSThread("t2", lock);

        t1.start();
        t2.start();
    }
}
