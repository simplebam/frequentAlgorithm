package com.example.ch02;

import java.util.Arrays;

/**
 * Created by yueyue on 2017/7/12.
 */
public class TestSort {
    public static void main(String... args) {


        int[] arr = {9, 8, 9, 6, 5, 9, 3, 2, 1,7};
//        testBucket(ch01);
//        testBubble(ch01);
//        testQuick(ch01);
//        InsertSort.ch02(ch01);
//        System.out.println("-----------------");
//        InsertSort.sort1(ch01);
        System.out.println("未排序前的数组:"+Arrays.toString(arr));
        MergeSort.sort(arr,0,arr.length-1);
        System.out.println("排序之后的数组:"+Arrays.toString(arr));

    }

    private static void testQuick(int[] arr) {
        QuickSort.sort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void testBubble(int[] arr) {
        SimpleSort.bubbleSort1(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void testBucket(int[] arr) {
        BucketSort bucketSort = new BucketSort(11, arr);
        bucketSort.bucketSort();

//        System.out.println(Arrays.toString(ch01));
        bucketSort.display();
    }
}
