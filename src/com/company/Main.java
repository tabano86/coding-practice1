package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        MyBinaryTree tree = new MyBinaryTree();
//        tree.insert(10);
//        tree.insert(1);
//        tree.insert(4);
//        tree.insert(88);
//        tree.insert(60);
//        System.out.println(tree.BFS(0) != null ? "YES" : "NO");
//        System.out.println("HEIGHT: " + tree.depth());
//        EvenParenthesis ep = new EvenParenthesis();
//        System.out.println("IS BALANCED: " + ep.isBalanced());
        Palindrome p = new Palindrome();
        System.out.println(p.findAllPalindromes("a racecar does not have a rotator"));
    }
}
