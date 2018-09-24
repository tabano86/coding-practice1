package com.company;

class MyStack<T> {
    Data top;
    int size;

    MyStack() {
        size = 0;
    }

    void push(T value) {
        if (top == null) {
            top = new Data<>(value);
        } else {
            Data tmp = new Data<>(value);
            tmp.next = top;
            top = tmp;
        }
        size++;
    }

    void pop() {
        if (top == null) {
            return;
        }
        Data tmp = top;
        top = top.next;
        size--;
    }

    class Data<T> {
        Data(T value) {
            this.value = value;
        }

        Data next;
        T value;
    }
}
