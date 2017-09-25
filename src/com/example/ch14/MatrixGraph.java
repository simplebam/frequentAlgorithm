package com.example.ch14;

/**
 * Created by yueyue on 2017/8/11.
 */
public class MatrixGraph {

    private Vertex[] vertices;//存储节点
    private int nVertex;

    private int[][] matrix;

    private int maxSize;


    public MatrixGraph(int maxSize) {
        this.maxSize = maxSize;
        vertices = new Vertex[maxSize];
        matrix = new int[maxSize][maxSize];

        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                matrix[i][j] = 0;
            }
        }

    }


    public void addVertex(char label) {
        Vertex vertex = new Vertex(label);
        vertices[nVertex++] = vertex;
    }

    public void addEdge(int start, int end) {
        matrix[start][end] = 1;
        matrix[end][start] = 1;
    }


    public void display() {
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }
}
