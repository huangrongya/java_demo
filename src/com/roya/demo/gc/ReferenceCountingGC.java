package com.roya.demo.gc;

import java.math.BigDecimal;

/**
 * @Author royle.huang
 * @Date 10:59 2020/5/13
 * @Description 引用计数法缺陷 testGC方法执行后，objA和objB会不会被Gc呢
 **/
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024*1024;

    private byte[] bigSize = new byte[2*_1MB];

    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(0.00);
        BigDecimal b2 = BigDecimal.ZERO;
        boolean flag = b1.compareTo(b2)==0;
        System.out.println(b2.compareTo(b1));
        System.out.println(b2.compareTo(b1)<0);
        System.out.println(flag);
    }
}
