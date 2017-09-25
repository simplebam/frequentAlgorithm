package com.example.ch01;

/**
 * Created by yueyue on 2017/7/9.
 */
public class TestMyOrderArray {
    public static  void  main(String... args){

        //demo1();
        MyOrderArray array = new MyOrderArray();
        array.insert1(100);
        array.insert1(10);
        array.insert1(20);
        array.insert1(30);
        array.insert1(50);
        array.display();

        array.delete1(3);
        array.display();

    }

    private static void demo1() {
        MyOrderArray array = new MyOrderArray();
        array.insert(100);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(50);
        array.display();


        array.delete(3);
        array.display();

        System.out.println(array.search(20));
        array.display();


        long[] longArray={1,2,3,4,5,6,7,8,20};
        System.out.println(array.binarySearch(longArray,22,0,longArray.length-1));
        System.out.println(array.binarySearch1(longArray,8,0,longArray.length-1));
    }

}
