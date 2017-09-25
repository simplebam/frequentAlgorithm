package com.ch01;

import com.example.ch10.Info;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by yueyue on 2017/8/2.
 */
public class Test {

    public static void main(String... args) throws ParseException {

        ArrayList<Info> list = new ArrayList<>();
        list.add(new Info("1","1"));
        list.add(new Info("2","2"));
        list.add(new Info("3","3"));
        list.add(new Info("4","4"));
        list.add(new Info("5","5"));

        ArrayList<Info> list1 = list;
        System.out.println("list:" + list);
        System.out.println("list1:" + list1);

        list1.remove(2);


        System.out.println(list1.get(2));


        System.out.println();

        System.out.println("list:" + list);
        System.out.println("list1:" + list1);

    }
}
