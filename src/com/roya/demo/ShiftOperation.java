package com.roya.demo;

/**
 * 移位运算
 */
public class ShiftOperation {

    public static void main(String[] args) {

        int i = 254;
        System.out.println(Integer.toBinaryString(i));

        int j = i << 2;
        System.out.println(Integer.toBinaryString(j));
    }
}
