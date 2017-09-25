package com.example.ch09;

/**
 * Created by yueyue on 2017/7/29.
 */
public class MyTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertAndSearch(root, root, value);
        }
    }

    private void insertAndSearch(Node parent, Node node, int value) {
        if (node == null) {
            node = new Node(value);
            if (parent.data > value) {
                parent.leftChild = node;
            } else {
                parent.rightChild = node;
            }
        } else if (node.data == value) {
            return;
        } else {
            if (node.data > value) {
                insertAndSearch(node, node.leftChild, value);
            } else {
                insertAndSearch(node, node.rightChild, value);
            }
        }
    }


    public void clear(Node node) {
        if (node != null) {
            clear(node.leftChild);
            clear(node.rightChild);
            node = null;
        }
    }

    public void clear() {
        clear(root);
    }

    /*三种遍历交换一下顺序就好*/
    public void inOrder(Node localNode) {
        if (localNode != null) {
            inOrder(localNode.leftChild);
            System.out.print(localNode.data + "  ,");
            inOrder(localNode.rightChild);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.leftChild);
        int rightHeight = getHeight(node.rightChild);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    public int getAllHeight() {
        return getHeight(root);
    }


    public int size(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + size(node.leftChild) + size(node.rightChild);
    }


    public Node getNodeParent(int value) {
        if (root == null) {
            return null;
        }
        Node node = new Node(value);
        return getNodeParent(null, root, value);
    }

    private Node getNodeParent(Node parent, Node node, int value) {
        if (node == null) {
            return null;
        }

        if (node.data == value || node.data == value) {
            return parent;
        } else if (node.data > value) {
            return getNodeParent(node, node.leftChild, value);
        } else {
            return getNodeParent(node, node.rightChild, value);
        }


//        if (node.data == value) {
//            return parent;
//        } else if (node.data > value) {
//            return getNodeParent(node, node.leftChild, value);
//        } else {
//            return getNodeParent(node, node.rightChild, value);
//        }
    }

    public Node getNode(int value) {
        return getNode(root,value);
    }

    public Node getNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (node.data == value) {
            return node;
        } else if (node.data > value) {
            return getNode(node.leftChild, value);
        } else {
            return getNode(node.rightChild, value);
        }
    }

}
