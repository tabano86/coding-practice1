package com.company;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

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

    Integer depth() {
        return depth(root);
    }

    private Integer depth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.left);
        if (leftDepth > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
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

    Node BFS(Integer srchValue) {
        return BFS(root, srchValue);
    }

    private Node BFS(Node node, Integer srchValue) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            Node n = queue.remove();
            if (srchValue.equals(Objects.requireNonNull(n).value)) {
                return n;
            }
            if (n.left != null) {
                queue.offer(n.left);
            }
            if (n.right != null) {
                queue.offer(n.right);
            }
        }
        return null;
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
