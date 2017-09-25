package com.example.ch02;

/**
 * 插入排序
 * Created by yueyue on 2017/7/15.
 */
public class InsertSort {


    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }


    private static int binarySearch(int[] arr, int low, int high, int key) {
        while (low < high) {
            int middle = (low + high) >>> 1;
            if (arr[middle] < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return high;
    }

    private static int binarySearch1(int[] arr, int low, int high, int key) {
        while (low < high) {
            int middle = (low + high) >>> 1;
            if (arr[middle] == key) {
                return middle;
            } else if (arr[middle] < key) {
                return binarySearch1(arr, middle +1, high, key);
            } else {
                return binarySearch1(arr, low, middle - 1, key);
            }
        }

        return -1;
    }

    public static void sort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = binarySearch(arr, 0, i, arr[i]);
            int j;
            for (j = i; j > 0 && (j - 1) >= index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

}
