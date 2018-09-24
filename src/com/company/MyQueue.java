package com.company;

public class MyQueue<T> {
    Node head;

    MyQueue() {}

    void push(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tmp = new Node(value);
            tmp.next = head;
            head = tmp;
        }
    }

    void pop() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    class Node {
        Node next;
        T value;

        Node (T value) {
            this.value = value;
        }
    }
}
