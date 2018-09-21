package com.company;

import java.util.Stack;

class EvenParenthesis {
    String str = "()()()";

    EvenParenthesis() { }

    boolean isBalanced() {
        Stack<Character> stack = new Stack<>();
        for (Character c: str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
