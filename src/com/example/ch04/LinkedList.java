package com.example.ch04;

/**
 * 单向链表
 * Created by yueyue on 2017/7/16.
 */
public class LinkedList {

    private Node first;//头结点
    private int size;//头结点储存长度

    public LinkedList() {
        this.first = null;
        size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = first;
        first = node;//这里的意思是头结点储存数据的
        size++;
    }


    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("太长了,不好玩");
        }

        if (index == 0) {
            //插入头结点
            insertFirst(value);
        } else {
            Node node = new Node(value);
            Node current = first;
            Node prevous = first;

            while (index > 0) {
                prevous = current;
                current = current.next;
                index--;
            }

            node.next = prevous.next;
            prevous.next = node;
            size++;
        }


    }

    public Node deleteFirst() {
        if (first == null) return null;
        Node node = first;
        first = node.next;
        node.next = null;
        size--;
        return node;
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node search(int value) {
        Node current = first;
        while (current != null) {
            if (current.data == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node delete(int value) {
        Node current = first;
        Node previous = first;
        while (current.data != value) {
            if (current == null) {
                return null;
            }

            previous = current;
            current = current.next;
        }

        if (current == first) {
            //说明是第一个
            first = current.next;
        } else {
            //不是第一个
            previous.next = current.next;
            current.next = null;
        }
        size--;
        return current;
    }


    public int getSize() {
        return size;
    }


    /*使用一个数组进行反转*/
    public boolean reverseByArr() {
        Node[] arr = new Node[getSize()];//存储反转的元素
        int i = 0;//记录插入node节点在数据的位置
        Node current = first;
        arr[i++] = current;
        while (current.next != null) {
            current = current.next;
            arr[i++] = current;
        }

        //清除以前的连接-->否则会形成死循环
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j].next = null;
        }

        for (i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                //插入的是第一个
                current = first = arr[i];
            }

            current.next = arr[i];
            current = current.next;
        }

        return true;
    }


    /*从第2个节点到第N个节点，依次逐节点插入到第1个节点(head节点)之后，
    最后将第一个节点挪到新表的表尾。*/
    public void reverse() {
        Node current = first;
        Node last = first;
        Node temp = first;
        Node next = first.next;

        for (int i = 0; i < getSize() - 1; i++) {
            Node nextNext = next.next;
            next.next = temp;
            temp = next;
            next = nextNext;
        }

        last.next = null;//不置空会导致死循环,倒数第二跟倒数第一相互指向
        first = temp;// next此时已经为null

    }


    /*从第2个节点到第N个节点，依次逐节点插入到第1个节点(head节点)之后，
最后将第一个节点挪到新表的表尾。*/
    public void reverse1() {
        Node last = first;
        Node temp = first;
        Node next = first.next;

        while (next != null) {
            Node nextNext = next.next;
            next.next = temp;
            temp = next;
            next = nextNext;
        }

        last.next = null;
        first = temp;

    }
}
