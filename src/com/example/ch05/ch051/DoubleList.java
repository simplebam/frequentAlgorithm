package com.example.ch05.ch051;

/**
 * 双向链表-增删改查
 * Created by yueyue on 2017/7/18.
 */
public class DoubleList {

    private Node first;
    private Node last;

    private int size;

    public DoubleList() {
        first = null;
        last = null;
        size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (first == null) {
            last = node;
        } else {
            first.previous = node;//搞出去会报空指针异常
        }
        node.next = first;
        first = node;
        size++;
    }


    public void insertLast(int value) {
        Node node = new Node(value);
        if (last == null) {
            first = node;
        } else {
            last.next = node;
        }
        node.previous = last;
        last = node;
        size++;

    }

    public Node ondDelete() {
        size--;

        //只有一个结点
        Node current = first;
        first = null;
        last = null;
        return current;

    }

    public Node deleteFirst() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("数组为空");
        }
        if (first != null && first == last) {
            return ondDelete();
        }

        Node current = first;
        first = current.next;
        first.previous = null;
        current.next = null;
        size--;
        return current;
    }

    public Node deleteLast() {

        if (isEmpty()) {
            throw new IndexOutOfBoundsException("数组为空");
        }
        if (first != null && first == last) {
            return ondDelete();
        }

        Node current = last;
        last = current.previous;
        current.previous = null;
        last.next = null;
        size--;
        return current;
    }


    public Node deleteByIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("数组越界,数组长度" + size + "  索引值" + index);
        }

        Node current = first;
        while (index > 0) {
            current = current.next;
            index--;
        }

        if (current == first) {
            return deleteFirst();
        } else if (current == last) {
            return deleteLast();
        } else {
            Node previous = current.previous;
            previous.next = current.next;
            current.previous = null;
            size--;
            return current;
        }


    }


    public Node deleteByData(int data) {

        if (first == null) {
            return null;
        }

        Node current = first;

        while (current.data != data) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }


        if (current == first) {
            return deleteFirst();
        } else if (current == last) {
            return deleteLast();
        } else {
            Node previous = current.previous;
            previous.next = current.next;
            current.previous = null;
            size--;
            return current;
        }

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
