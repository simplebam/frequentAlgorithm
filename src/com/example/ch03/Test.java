package com.example.ch03;

/**
 * Created by yueyue on 2017/7/16.
 */
public class Test {


    public static void main(String... args) {

//        testMyQueue();

//      testStack();

    }

    private static void testStack() {
        MyQueue2MyStack mq = new MyQueue2MyStack(4);
        System.out.println(mq.push(1));
        System.out.println(mq.push(2));
        System.out.println(mq.push(3));
        System.out.println(mq.push(4));
        System.out.println(mq.push(5));

        System.out.println(mq.pop());
    }

    private static void testMyQueue() {
//        test1();
        MyStack2MyQueue ms = new MyStack2MyQueue(4);
        System.out.println(ms.push(1));
        System.out.println(ms.push(2));
        System.out.println(ms.push(3));
        System.out.println(ms.push(4));
        System.out.println(ms.push(5));

        System.out.println(ms.push());

    }

    private static void test1() {
        MyQueue mq = new MyQueue(4);
        mq.push(1);
        mq.push(2);
        mq.push(3);
        mq.push(4);

//        System.out.println(mq.isFull());
//        System.out.println(mq.isEmpty());

//        System.out.println(mq.isFull());
//        System.out.println(mq.isEmpty());


        while (!mq.isEmpty()) {
            System.out.print(mq.pop() + " ");
        }

        mq.push(1);
        mq.push(2);
        mq.push(3);
        mq.push(4);


        while (!mq.isEmpty()) {
            System.out.print(mq.pop() + " ");
        }
    }

}
