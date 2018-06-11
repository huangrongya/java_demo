package com.roya.demo.sort;

/**
 * describe: 冒泡排序
 * create by huangrongya
 * 2018/6/11 0011 17:24
 **/
public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
