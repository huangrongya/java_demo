package com.roya.demo.sort;

public class Test {

    public static void main(String[] args) {
        int[] arr = {23, 41, 1, 55, 7, 32, 0, 13};
//        selectSort(arr);
//        insertionSort(arr);
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }


    public static void quickSort(int[] arr, int start, int end){
        if (start > end) {
            return;
        }
        int i = start;
        int j = end;
        int pivot = arr[end];
        while (i < j){
            while (i < j && pivot > arr[i]){
                i++;
            }
            if (i < j){
                arr[j--] = arr[i];
            }
            while (i < j && pivot < arr[j]){
                j--;
            }
            if (i < j) {
                arr[i++] = arr[j];
            }
        }
        arr[j] = pivot;
        quickSort(arr, start, j-1);
        quickSort(arr, j+1, end);
    }

    /**
     * @author Royle.Huang
     * @date 2019/1/3 10:56
     * @description: 插入排序
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    /**
     * @author Royle.Huang
     * @date 2019/1/3 10:25
     * @description: 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * @author Royle.Huang
     * @date 2019/1/3 10:27
     * @description: 选择排序
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
