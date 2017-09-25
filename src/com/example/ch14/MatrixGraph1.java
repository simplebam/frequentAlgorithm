package com.example.ch14;

/**
 * Created by yueyue on 2017/8/11.
 */
public class MatrixGraph1 {

    private Vertex[] vertices;//存储节点
    private int nVertex;

    private int[][] matrix;

    private int maxSize;


    public MatrixGraph1(Vertex[] vertices) {
        this.vertices = vertices;
        matrix = new int[vertices.length][vertices.length];
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                matrix[i][j] = 0;
            }
        }

    }


//    public void addVertex(char label) {
//        Vertex vertex = new Vertex(label);
//        vertices[nVertex++] = vertex;
//    }

    public void addEdge(int start, int end) {
        matrix[start][end] = 1;
        matrix[end][start] = 1;
    }


    public void display() {
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }
}
