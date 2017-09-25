package com.example.ch07;

/**
 * Created by yueyue on 2017/7/20.
 */
public class HaniTower {

    public static void doTower(int TopN, char from, char inter, char to) {
        if (TopN == 1) {
            System.out.println("盘子1从" + from + "移动到" + to);
        } else {
            doTower(TopN - 1, from, to, inter);
            System.out.println("盘子+" + TopN + "从" + from + "移动到" + to);
            doTower(TopN - 1, inter, from, to);
        }
    }
}
