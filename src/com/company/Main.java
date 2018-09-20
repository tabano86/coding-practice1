package com.company;

public class Main {

    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        tree.insert(10);
        tree.insert(1);
        tree.insert(4);
        tree.insert(88);
        tree.insert(60);
        tree.printInOrder();
    }
}
