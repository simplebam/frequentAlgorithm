package com.example.ch09;


/**
 * Created by yueyue on 2017/7/29.
 */
public class Test {

    public static void main(String... args) {

        MyTree mt = new MyTree();
        mt.insert(20);
        mt.insert(10);
        mt.insert(30);
        mt.insert(15);
        mt.insert(45);
        mt.insert(33);
        mt.insert(90);
        mt.insert(30);
        mt.insert(70);


//        mt.clear();
//        mt.clear(mt.getRoot().leftChild);
//        mt.inOrder(mt.getRoot());

//        System.out.println(mt.size(mt.getRoot()));
//        System.out.println(mt.search(77));
////        mt.inOrder(mt.getRoot());
//
//        mt.delete(20);
//        mt.inOrder(mt.getRoot());

        System.out.println(mt.getNode(99));

    }
}
