package com.example.ch13;

/**
 * Created by yueyue on 2017/8/4.
 */
public class Test {

    public static void main(String... args) {
        HashTable table = new HashTable(100);
        table.insert(new Info("a","111"));
        table.insert(new Info("ct","222"));


        System.out.println(table.find("a").getName());
        System.out.println(table.find("ct").getName());


        System.out.println("删除.........");
        System.out.println(table.delete("a").getName());
        System.out.println(table.find("a"));
    }
}
