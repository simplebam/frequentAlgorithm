package com.example.ch04;

/**
 * Created by yueyue on 2017/7/16.
 */
public class TestLinkList {

    public static void main(String... args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.display();

//        reverseByArr(list);

//        boolean b = list.reverseByArr();
//        System.out.println(b);
//        list.display();
        list.reverse1();
        list.display();
    }


}
