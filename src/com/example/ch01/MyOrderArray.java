package com.example.ch01;

/**
 * 实现自己的有序数组-增删改查
 * Created by yueyue on 2017/7/9.
 */
public class MyOrderArray {

    private static final int DEFAULT_MAX_CAPACITY = 50;//默认的最大容量

    private long[] arr;

    private int size = 0;//默认有效长度为0

    public MyOrderArray() {
        arr = new long[DEFAULT_MAX_CAPACITY];
    }

    public MyOrderArray(int capacity) {
        if (capacity >= 0) {
            arr = new long[capacity];
        } else {
            arr = new long[DEFAULT_MAX_CAPACITY];
        }
    }

    /**
     * 插入元素
     *
     * @param newValue
     */
    public void insert(long newValue) {
        int i = 0;
        for (; i < size; i++) {
            if (newValue <= arr[i]) {
                break;
            }
        }
        int j = size;
        for (; j > i; j--) {
            arr[j] = arr[j - 1];
        }

        size++;
        arr[j] = newValue;

    }


    /**
     * 使用数组快速复制插入
     * @param newValue
     */
    public void insert1(long newValue){
        int i = 0;
        for (; i < size; i++) {
            if (newValue <= arr[i]) {
                break;
            }
        }

        System.arraycopy(arr,i,arr,i+1,size-i);
        arr[i]=newValue;
        size++;
    }

    /**
     * 打印数组
     */
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb.append(arr[i] + " ]");
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        System.out.println(sb.toString());
    }


    /**
     * 根据索引删除数组元素
     *
     * @param index
     */
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("不在数组的正常范围内");
        }


        for (int j = index; j < size; j++) {
            arr[j] = arr[j + 1];
        }

        size--;
    }

    /**
     * 使用数组快速复制进行删除元素
     * @param index
     */
    public void delete1(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("不在数组的正常范围内");
        }


        System.arraycopy(arr,index+1,arr,index,size-index-1);

        size--;
    }

    /**
     * 根据值查询位置
     *
     * @param value
     * @return
     */
    public long search(long value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 二分查找
     *
     * @param array
     * @param value
     * @param low
     * @param length
     * @return
     */
    public static long binarySearch(long[] array, long value, int low, int length) {

        int middle = (low + length) >>> 1;
        if (low <= length) {
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                //右边
                return binarySearch(array, value, middle + 1, length);
            } else {
                //左边
                return binarySearch(array, value, low, middle - 1);
            }

        } else {
            return -1;
        }

    }

    /**
     * 非递归实现二分查找
     *
     * @param array
     * @param value
     * @param low
     * @param length
     * @return
     */
    public static long binarySearch1(long[] array, long value, int low, int length) {
        while (low <= length) {
            int middle = (low + length) >>> 1;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] <= value) {
                //右边
                low = middle + 1;
            } else {
                length = middle - 1;
            }
        }

        return -1;
    }


    /**
     * 得到数组的长度
     *
     * @return
     */
    public int getSize() {
        return size;
    }

}
