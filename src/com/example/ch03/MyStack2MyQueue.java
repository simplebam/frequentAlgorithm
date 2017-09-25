package com.example.ch03;

/**
 * Created by yueyue on 2017/7/16.
 */
public class MyStack2MyQueue {

    private MyStack ms1;
    private MyStack ms2;
    private int maxLength;

    public MyStack2MyQueue(int capacity) {
        this.maxLength = capacity;
        ms1 = new MyStack(capacity);
        ms2 = new MyStack(capacity);
    }


    public boolean push(int value) {
        if (ms1.isFull() || maxLength==size()) {
            return false;//满了
        }

        ms1.push(value);
        return true;
    }


    public int push() {
        if (ms2.isEmpty()) {
            while (!ms1.isEmpty()) {
                ms2.push(ms1.pop());
            }
        }
        return ms2.pop();
    }

    public int size() {
        return ms1.size()+ms2.size();
    }
}
