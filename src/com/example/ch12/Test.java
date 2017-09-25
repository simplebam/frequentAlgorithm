package com.example.ch12;

/**
 * Created by yueyue on 2017/8/2.
 */
public class Test {

    public static void main(String... args) {

//        LinkList list = new LinkList();
//        list.insertFirst(11);
//        list.insertFirst(22);
//        list.insertFirst(33);
//        list.insertFirst(44);

        HashTable table = new HashTable();
        table.insert(new Info("a","11"));
        table.insert(new Info("ct","22"));
        table.insert(new Info("b","22"));
        table.insert(new Info("cc","33"));

        System.out.println(table.find("a"));
        System.out.println(table.find("ct"));
        System.out.println(table.find("dd"));

        System.out.println("----------------------------");
        System.out.println(table.delete("a"));
        System.out.println(table.find("a"));




    }
}
