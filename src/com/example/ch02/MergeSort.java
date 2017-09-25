package com.example.ch02;

/**
 * 归并排序
 * Created by yueyue on 2017/7/16.
 */
public class MergeSort {

    public static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) >>> 1;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;//左边数组开始的位置
        int j = mid + 1;//右边数组开始的位置
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }

//        while (i <= mid && j <= high) {
//            if (ch01[i] < ch01[j]) {
//                temp[k++] = ch01[i++];
//            } else {
//                temp[k++] = ch01[j++];
//            }
//        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + low] = temp[k2];
        }

    }
}


