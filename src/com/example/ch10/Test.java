package com.example.ch10;

/**
 * Created by yueyue on 2017/7/31.
 */
public class Test {


    public static void main(String... args) {
        HashTable table = new HashTable(100);
        table.insert(new Info("a", "张三"));
        table.insert(new Info("ct", "李四"));
//        table.insert(new Info("cba", "王五"));
//        table.insert(new Info("zhaoliu", "赵六"));


        System.out.println("----------------------------------------");
        System.out.println(table.find("a"));
        System.out.println(table.find("ct"));
//        System.out.println(table.find("cba"));
    }
}
