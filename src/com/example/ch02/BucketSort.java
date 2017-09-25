package com.example.ch02;

/**
 * 桶排序
 * Created by yueyue on 2017/7/11.
 */
public class BucketSort {

    private int[] bucket;//桶
    private int[] array;

    public BucketSort(int range, int[] array) {
        this.bucket = new int[range];
        this.array = array;
    }

    /**
     * 排序
     */
    public void bucketSort() {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                bucket[array[i]]++;
            }
        }
    }

    /**
     * 打印
     */
    public void display() {
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > 0) {
                //需要输出
                for (int j = 0; j < bucket[i]; j++) {
                    System.out.print(i + " ,");
                }
            }
        }
        System.out.println();
    }


}
