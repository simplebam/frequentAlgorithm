package com.example.ch03;

/**
 * 队列的操作
 * Created by yueyue on 2017/7/16.
 */
public class MyQueue1 {

    private long[] arr;
    private int top = 0;
    private int end = 0;

    public MyQueue1() {
        this(10);
    }

    public MyQueue1(int init) {

        if (init <= 0) {
            init = 10;
        }
        arr = new long[init];
    }

    public void push(long value) {
        if (end == arr.length) {
            end = 0;
        }
        arr[end++] = value;
    }

    public long pop() {
        if (top == end) {
            throw new IndexOutOfBoundsException("队伍为空");
        }
        if (top == arr.length) {
            top = 0;
        }

        return arr[top++];
    }

    public long peek() {
        if (top == end) {
            throw new IndexOutOfBoundsException("队伍为空");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == end;
    }

    public boolean isFull() {
        return end == arr.length;
    }

}
