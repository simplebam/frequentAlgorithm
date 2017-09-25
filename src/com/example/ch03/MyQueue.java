package com.example.ch03;

/**
 * 队列的操作
 * Created by yueyue on 2017/7/16.
 */
public class MyQueue {

    private int[] arr;
    private int top = 0;
    private int end = -1;
    private int size = 0;//有效元素

    public MyQueue() {
        this(10);
    }

    public MyQueue(int init) {

        if (init <= 0) {
            init = 10;
        }
        arr = new int[init];
    }

    public void push(int value) {
        if (end == arr.length - 1) {
            end = -1;
        }
        arr[++end] = value;
        size++;
    }

    public int pop() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException("队伍为空");
        }
        if (top == arr.length) {
            top = 0;
        }

        size--;
        return arr[top++];
    }

    public int peek() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException("队伍为空");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

}
