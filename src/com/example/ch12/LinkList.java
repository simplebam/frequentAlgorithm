package com.example.ch12;

/**
 * Created by yueyue on 2017/8/2.
 */
public class LinkList {

    private Node root;


    public Node getRoot() {
        return root;
    }


    public void insertFirst(Info value) {
        Node node = new Node(value);
        node.next = root;
        root = node;
    }


    public Info find(String key) {
        if (root == null) {
            return null;
        }
        Node current = root;
        while (!current.data.getKey().equals(key)) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        return current.data;
    }


    public Info delete(String key) {
        if (root == null) {
            return null;
        }

        Node current = root;
        Node parent = root;
        while (!current.data.getKey().equals(key)) {
            parent = current;
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == root) {
            root = root.next;
            current.next = null;
        } else {
            parent.next = current.next;
            current.next = null;
        }
        return current.data;
    }


}
