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
//        Palindrome p = new Palindrome();
//        System.out.println(p.findAllPalindromes("rotator"));
//        StringReverse s = new StringReverse();
//        System.out.println(s.("abcdefgh"));
//        MyQueue<String> q = new MyQueue<>();
//        q.push("A");
//        q.push("B");
//        q.push("C");
//        q.push("D");
//        q.push("E");
//        q.pop();
//        q.pop();
//        q.push("Y");
//        q.push("Z");
        System.out.println(additionTrick(729));
    }

    static int additionTrick(int addend) {
        System.out.println( addend % 10  );
        int tmp = (int) (addend / (10*Math.log10(addend)));
        return tmp;
    }
}
