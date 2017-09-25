package com.example.ch02;

/**
 * 简单排序
 * 参考博客:http://www.cnblogs.com/QG-whz/p/5194569.html
 * Created by yueyue on 2017/7/12.
 */
public class SimpleSort {

    /**
     * 交换数组中的两个数字
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 0) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;

        }
    }


    /**
     * 二分插入排序
     *
     * @param arr
     */
    public static void binInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j;
            int insertIndex = bsForInsert(arr, 0, i, arr[i]);
            for (j = i; j > 0 && (j - 1) >= insertIndex; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = temp;

        }
    }

    /**
     * 二分查找-为的是二分插入排序提供位置
     *
     * @param arr  需要查找的数组
     * @param low  数组左端点
     * @param high 数组右端点
     * @param key  关键字
     * @return
     */
    private static int bsForInsert(int[] arr, int low, int high, int key) {
        int start = low;
        int end = high;
        while (start <= end) {
            int middle = (start + end) >>> 1;
            if (arr[middle] > key) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return start;
    }


    /**
     * 大的向下-冒泡
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }
        }
    }


    /**
     * 小的向上
     *
     * @param arr
     */
    public static void bubbleSort1(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = arr.length - 1; j > arr.length - 1 - i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
            }
        }

    }

    /*希尔排序-移动法*/
    public static void shellSort(int[] arr) {

        int k;
        for (k = arr.length; k > 0; k = k >>> 1) {
            for (int i = k; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= k && arr[j - k] > temp; j -= k) {
                    //j>=k这里一定需要<= 如果你使用j>k的话,第一个数字将不进行排序
                    arr[j] = arr[j - k];
                }

                arr[j] = temp;
            }
        }

    }

    public static void shellSort1(int[] arr) {

        int k;
        for (k = arr.length; k > 0; k /= 2) {
            for (int i = k; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= k && arr[j - k] > temp; j--) {
                    arr[j] = arr[j - k];
                }

                arr[j] = temp;
            }
        }


    }


    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];//默认j的第一个为最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    swap(arr, i, j);
                }
            }
        }
    }


}
