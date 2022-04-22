package com.roya.demo.sync;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 线程安全相关
 * @author royle
 */
public class ThreadSafe {

    public static void main(String[] args) {

        //获取一个不可变集合 用Collections.unmodifiableXXX
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);


        ThreadLocal local1 = new ThreadLocal();
        ThreadLocal local2 = new ThreadLocal();

        Thread thread1 = new Thread(()->{
            local1.set(1);
            local2.set(1);
        });

        Thread thread2 = new Thread(()->{
            local1.set(2);
            local2.set(2);
        });

        thread1.start();
        thread2.start();
    }
}
