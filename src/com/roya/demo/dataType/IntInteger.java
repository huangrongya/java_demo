package com.roya.demo.dataType;

import java.util.Objects;

public class IntInteger {

    public static void main(String[] args) {

        /**
         * 当数值不在 -128~127范围时就不会进行缓存操作，它会选择进行new integer()的操作。
         **/
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);
        System.out.println(Objects.equals(a, b));
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}
