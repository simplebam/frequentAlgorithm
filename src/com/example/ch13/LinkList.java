package com.example.ch13;

/**
 * Created by yueyue on 2017/8/3.
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

    public Node find(String key) {
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
        return current;
    }

    public Node delete(String key) {
        if (root == null) {
            return null;
        }

        Node current = root;
        Node previous = root;
        while (!current.data.getKey().equals(key)) {
            previous = current;
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == root) {
            root = root.next;
            current.next = null;
        } else {
            previous.next = current.next;
            current.next = null;
        }
        return current;
    }

}
