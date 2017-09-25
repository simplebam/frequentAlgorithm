package com.example.ch02;

/**
 * 快速排序
 * Created by yueyue on 2017/7/14.
 */
public class QuickSort {


    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int start = low;
            int end = high;
            int key = arr[low];
            while (start < end) {
                while (start < end && arr[end] > key) end--;
                if (start < end) {
                    arr[start] = arr[end];
                    start++;
                }

                while (start < end && arr[start] < key) start++;
                if (start < end) {
                    arr[end] = arr[start];
                    end--;
                }

                arr[start] = key;

                sort(arr, low, start - 1);
                sort(arr, start + 1, high);

            }

        }

    }


    private static int partition(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int key = arr[low];
        while (start < end) {
            while (start < end && arr[end] > key) end--;
            if (start < end) {
                arr[start] = arr[end];
                start++;
            }
            while (start < end && arr[start] < key) start++;
            if (start < end) {
                arr[end] = arr[start];
                end--;
            }

            arr[start] = key;


        }

        return start;
    }


    public static void sort1(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);

            sort1(arr, low, partition - 1);
            sort1(arr, partition + 1, high);
        }
    }
}

