package com.example.ch06;

/**
 * 递归
 * Created by yueyue on 2017/7/19.
 */
public class Recusion {

    public static void main(String... args) {
        System.out.println(triangle(4));

    }

    private static int triangle(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return triangle(n-1) + triangle(n - 2);

    }
}
