package com.example.ch15;

/**
 * Created by yueyue on 2017/8/12.
 */
public class ListGraph {

    private VertexNode[] nodes;

    public ListGraph(char[] labels) {
        nodes = new VertexNode[labels.length];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new VertexNode(labels[i]);
        }
    }


    public void addEdge(char start, char[] end) {
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].label == start) {
                VertexNode node = nodes[i];
                for (int j = 0; j < end.length; j++) {
                    node.next = new VertexNode(end[j]);
                    node = node.next;
                }
            }
        }

    }

    public void display() {
        for (int i = 0; i < nodes.length; i++) {
            VertexNode node = nodes[i];
            while (node != null) {
                System.out.print(node.label + " ,");
                node = node.next;
            }
            System.out.println();
        }
    }

}


