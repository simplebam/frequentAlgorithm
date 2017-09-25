package com.example.ch05;

/**
 * 双向链表-增删改查
 * Created by yueyue on 2017/7/17.
 */
public class FirstLastLinkList {

    private int size = 0;//记录插入的节点数字
    private Node first;
    private Node last;

    /*插入*/
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            last = node;
            first = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;

    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组越界");
        }

        if (index == 0) {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            Node node = new Node(value);
            Node current = first;
            Node previous = first;
            int length = size;
            while (length > 0) {
                previous = current;
                current = current.next;
                length--;
            }
            node.next = previous.next;
            previous.next = node;
            size++;
        }
        return true;
    }

    public Node deleteFirst() {
        if (first == null) {
            throw new IndexOutOfBoundsException("数组为空");
        }
        Node node = first;
        first = first.next;
        node.next = null;
        size--;
        return node;
    }

    public Node deleteLast() {
        if (last == null) {
            throw new IndexOutOfBoundsException("数组为空");
        }
        int lenght = size;
        Node current = first;
        Node previous = first;

        while (lenght > 1) {
            previous = current;
            current = current.next;
            lenght--;
        }

        previous.next = null;
        Node node = last;
        last = previous;
        size--;
        return node;
    }

    public Node delete(int index) {
        if (first == null) {
            throw new IndexOutOfBoundsException("数组为空");
        }

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组越界");
        }

        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        } else {
            Node current = first;
            Node previous = first;

            while (index > 0) {
                previous = current;
                current = current.next;
                index--;
            }
            previous.next = current.next;
            Node node = current;
            current.next = null;
            size--;
            return node;
        }

    }


    public int search(int value) {
        if (first == null || last == null) {
            throw new IndexOutOfBoundsException("数组为空");
        }
        int lenght = 0;
        Node current = first;
        while (current.data != value) {
            if (current == null) {
                return -1;
            }
            lenght++;
            current = current.next;
        }

        if (current != null) {
            return lenght;
        }

        return -1;
    }


    /*判断是否为空*/
    private boolean isEmpty() {
        return first == null;
    }


    public void display() {
        if (first == null || last == null) {
            throw new IndexOutOfBoundsException("数组为空");
        }
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }


}
