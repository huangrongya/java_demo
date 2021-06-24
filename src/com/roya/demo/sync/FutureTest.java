package com.roya.demo.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author royle
 */
public class FutureTest {

    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<>());
        /*long begin = System.currentTimeMillis();
        Future<String> future = executor.submit(() -> {
            Thread.sleep(1000L);
            return "hello";
        });
        Future<String> future2 = executor.submit(() -> {
            Thread.sleep(1000L);
            return "world";
        });
        Future<String> future3 = executor.submit(() -> {
            Thread.sleep(1000L);
            return "world";
        });
        long end = System.currentTimeMillis();
        System.out.println("执行方法共用了："+(end-begin)+" ms");

        System.out.println(future.get());
        System.out.println(future2.get());*/

        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Future<Integer> future = executor.submit(()-> {
                Thread.sleep(1000L);
                return finalI;
            });
            list.add(future);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).get()+", ");
        }

    }
}
