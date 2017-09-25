package com.example.ch14;

/**
 * Created by yueyue on 2017/8/11.
 */
public class Test {
    public static void main(String... args) {
//        demo1();

        Vertex[] vertices = new Vertex[4];
        vertices[0]=new Vertex('a');
        vertices[1]=new Vertex('b');
        vertices[2]=new Vertex('c');
        vertices[3]=new Vertex('d');
        MatrixGraph1 matrixGraph = new MatrixGraph1(vertices);

        matrixGraph.addEdge(0,2);
        matrixGraph.addEdge(2,3);
        matrixGraph.display();

    }

    private static void demo1() {
        MatrixGraph matrixGraph = new MatrixGraph(4);
        matrixGraph.addVertex('a');
        matrixGraph.addVertex('b');
        matrixGraph.addVertex('c');
        matrixGraph.addVertex('d');

        matrixGraph.addEdge(0,1);
        matrixGraph.addEdge(2,3);

        matrixGraph.display();
    }
}
