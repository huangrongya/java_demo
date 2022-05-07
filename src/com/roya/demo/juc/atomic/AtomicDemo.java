package com.roya.demo.juc.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 原子类demo
 * @author royle
 */
public class AtomicDemo {

    public static void main(String[] args){
        AtomicInteger i = new AtomicInteger();

        System.out.println(i.get());
        System.out.println(i.incrementAndGet());
        System.out.println(i.addAndGet(1));

        AtomicIntegerArray arr = new AtomicIntegerArray(new int[]{0, 0});
        arr.addAndGet(1, 2);
        System.out.println(arr);
        arr.compareAndSet(1, 2, 1);
        System.out.println(arr);

        //AtomicStampedReference 可以解决ABA问题
        AtomicStampedReference<Integer> a = new AtomicStampedReference<>(1, 0);
        Thread main = new Thread(()->{
            System.out.println("线程："+Thread.currentThread()+ " 初始值："+a.getReference());
            int stamp = a.getStamp();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程：main "+ " 获取到的值："+a.getReference());
            boolean success = a.compareAndSet(2, 1, stamp, stamp+1);
            System.out.println("线程 main: "+success);
        });
        Thread other = new Thread(()->{
            //确保main线程先执行
            Thread.yield();
            System.out.println("线程：other 初始值："+a.getReference());
            boolean success = a.compareAndSet(1, 2, 0, 1);
            System.out.println("线程 other: "+success);
        });

        main.start();
        other.start();
    }
}
