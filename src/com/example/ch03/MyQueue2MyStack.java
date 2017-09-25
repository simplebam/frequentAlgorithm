package com.example.ch03;

/**
 * Created by yueyue on 2017/7/16.
 */
public class MyQueue2MyStack {

    private int maxLength;
    private MyQueue mq1;
    private MyQueue mq2;

    public MyQueue2MyStack(int capacity) {
        this.maxLength = capacity;
        mq1 = new MyQueue();
        mq2 = new MyQueue();

    }

    public boolean push(int value) {
        if (maxLength == size()) {
            return false;
        }

        if (mq2.isEmpty()) {
            mq1.push(value);
        } else {
            mq2.push(value);
        }
        return true;
    }


    public int pop() {
        if (size() == 0) {
            throw new IndexOutOfBoundsException("栈为空了");
        } else {
            if (mq2.isEmpty()) {
                while (mq1.size() > 1) {
                    mq2.push(mq1.pop());
                }
                return mq1.pop();
            } else {
                while (mq2.size() > 1) {
                    mq1.push(mq2.pop());
                }
                return mq2.pop();
            }

        }


    }


    public int size() {
        return mq1.size() + mq2.size();
    }

}
