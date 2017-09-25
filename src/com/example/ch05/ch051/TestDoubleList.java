package com.example.ch05.ch051;

/**
 * Created by yueyue on 2017/7/18.
 */
public class TestDoubleList {

    public static void main(String... args){

        DoubleList list = new DoubleList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        list.display();//未删除的数组排位

//        list.deleteFirst();
//        list.deleteLast();

        list.deleteByIndex(0);
        list.deleteByData(4);



        list.display();
    }
}
