package com.example.ch08;

/**
 * Created by yueyue on 2017/7/29.
 */
public class MyTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        //不是空树,树中已经有的元素不需要再插入
        Node current = root;
        Node parent = root;
        while (current.data != value) {
            parent = current;
            if (current.data > value) {
                //左边
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = node;
                    return;
                }
            } else {
                //右边
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }


    public boolean search(int value) {
        if (root == null) {
            return false;
        }

        Node current = root;
        while (current.data != value) {
            if (current.data > value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return false;
            }
        }

        return true;
    }


    //删除
    public boolean delete(int value) {
        if (root == null) {
            return false;
        }

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.data != value) {
            parent = current;
            if (current.data > value) {
                current = current.leftChild;
                isLeftChild = true;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }

            if (current == null) {
                return false;
            }
        }


        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.leftChild = null;
                } else {
                    parent.rightChild = null;
                }
            }
        } else if (current.leftChild == null) {
            //右边的子树
            if (current == root) {
                root = current.rightChild;
            } else {
                if (isLeftChild) {
                    parent.leftChild = current.rightChild;
                } else {
                    parent.rightChild = current.rightChild;
                }
            }
        } else if (current.rightChild == null) {
            //左边的子树
            if (current == root) {
                root = current.leftChild;
            } else {
                if (isLeftChild) {
                    parent.leftChild = current.leftChild;
                } else {
                    parent.rightChild = current.leftChild;
                }
            }
        } else {
            //中序后继
            Node succeessor = getSucceessor(current);
            if (current == root) {
                root = succeessor;
            } else {
                if (isLeftChild) {
                    parent.leftChild = current.leftChild;
                } else {
                    parent.rightChild = current.leftChild;
                }
            }

            succeessor.leftChild = current.leftChild;
        }

        return true;
    }


    private Node getSucceessor(Node delNode) {
        Node succossorParent = delNode;
        Node succossor = delNode;
        Node current = delNode.rightChild;

        while (current != null) {
            succossorParent = succossor;
            succossor = current;
            current = current.leftChild;
        }

        if (succossor != delNode.rightChild) {
            succossorParent.leftChild = succossor.rightChild;
            succossor.rightChild = delNode.rightChild;
        }

        return succossor;
    }

    public boolean isEmpty() {
        return root == null;
    }

    /*三种遍历交换一下顺序就好*/
    public void inOrder(Node localNode) {
        if (localNode != null) {
            inOrder(localNode.leftChild);
            System.out.print(localNode.data + "  ,");
            inOrder(localNode.rightChild);
        }
    }

    public Node getNodeParent(int value) {
        if (root == null) {
            return null;
        }

        Node current = root;
        Node parent = null;
        while (current.data != value) {
            parent = current;
            if (current.data > value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return null;
            }
        }

        return parent;
    }
}
