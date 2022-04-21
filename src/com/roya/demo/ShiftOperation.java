package com.roya.demo;

/**
 * 移位运算
 */
public class ShiftOperation {

    public static void main(String[] args) {

        int i = 256;
        System.out.println(Integer.toBinaryString(i));

        int j = i << 1;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(j);
        System.out.println(i>>1);
        System.out.println(Integer.toBinaryString(i-1));
        System.out.println(Integer.toBinaryString((i - 1)&-10));
    }
}
