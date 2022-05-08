package com.roya.demo.juc;

import java.util.concurrent.locks.LockSupport;

/**
 * @author royle
 */
public class LockSupportDemo {

    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        //先调用wait 再调用notify 线程会阻塞
        thread.start();
        Thread.sleep(3000);
        synchronized (thread){
            System.out.println("before wait...");
            thread.wait();
            System.out.println("after wait...");
        }
    }

    public static class ParkAndUnparkDemo {
        public static void main(String[] args) throws InterruptedException {
            //先调用unpark 再调用park 线程不会阻塞, 因此 park/unpark比wait/notify更加灵活
            //其它某个线程把当前线程作为目标 调用unpark 线程会继续运行
            //interrupt 需要按顺序调用
            LockSupportThread t = new LockSupportThread(Thread.currentThread());
            t.start();
            Thread.sleep(3000);
            System.out.println("before park...");
            LockSupport.park();
            System.out.println("after park...");
        }
    }
}
