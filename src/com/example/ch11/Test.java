package com.example.ch11;

/**
 * Created by yueyue on 2017/7/31.
 */
public class Test {


    public static void main(String... args) {
        HashTable table = new HashTable(4);
        table.insert(new Info("a", "张三"));
        table.insert(new Info("ct", "李四"));
        table.insert(new Info("b", "王五"));
        table.insert(new Info("cba", "王五"));
//        table.insert(new Info("zhaoliu", "赵六"));


        System.out.println();
        table.display();

//        System.out.println(table.find("a"));
//        System.out.println(table.find("ct"));
//        System.out.println(table.find("b"));
//        System.out.println(table.find("cba"));
//        System.out.println(table.find("zhaoliu"));


        System.out.println("----------------------------------------");
    }
}
