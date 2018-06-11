package com.roya.demo.sort;

public class Test {

    public static void main(String[] args) {
        int[] arr = {23, 41, 1, 55, 7, 32, 0, 13};
        BubbleSort.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
