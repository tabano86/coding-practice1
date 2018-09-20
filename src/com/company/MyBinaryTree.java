package com.company;

class MyBinaryTree {
    private Node root;

    MyBinaryTree() {}

    void insert(Integer value) {
        insert(value, root);
    }

    private void insert(Integer value, Node node) {
        if (node == null) {
            root = new Node(value);
            node = root;
        }

        if (value > node.value ) { // right
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                insert(value, node.right);
            }
        }
        if (value < node.value ) { //left
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insert(value, node.left);
            }
        }
    }

    void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.value + ",");
        printInOrder(node.right);
    }


    class Node {
        Node(Integer value) {
            this.value = value;
        }

        Integer value;
        Node left;
        Node right;
    }
}
