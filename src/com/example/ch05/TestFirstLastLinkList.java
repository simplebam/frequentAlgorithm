package com.example.ch05;

/**
 * Created by yueyue on 2017/7/17.
 */
public class TestFirstLastLinkList {

    public static void main(String... args) {
        FirstLastLinkList list = new FirstLastLinkList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(3);
        list.insert(3,4);
        list.insertLast(5);
        list.insertLast(6);


        list.display();


        System.out.println(list.search(2));
        System.out.println(list.search(1));
        System.out.println(list.search(3));
        System.out.println(list.search(4));
        System.out.println(list.search(5));
        System.out.println(list.search(6));



    }
}
