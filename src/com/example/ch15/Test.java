package com.example.ch15;

/**
 * Created by yueyue on 2017/8/12.
 */
public class Test {

    public static void main(String... args) {
        ListGraph listGraph = new ListGraph(new char[]{'a', 'b', 'c', 'd'});
        listGraph.addEdge('a',new char[]{'b', 'c'});
        listGraph.addEdge('b',new char[]{'c', 'd'});

        listGraph.display();
    }
}
