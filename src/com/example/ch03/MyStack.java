package com.example.ch03;

import java.util.Arrays;

/**
 * Created by yueyue on 2017/7/16.
 */
public class MyStack {
    private int[] arr;
    private int top = -1;

    public MyStack() {
        this(10);
    }

    public MyStack(int init) {
        if (init <= 0) {
            init = 10;
        }
        arr = new int[init];
    }

    public void push(int value) {
        if (top == arr.length - 1) {
            //扩容
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("栈为空");
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("栈为空");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public int size() {
        return top+1;
    }

}
