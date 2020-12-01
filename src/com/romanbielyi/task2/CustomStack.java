package com.romanbielyi.task2;

public class CustomStack<T> implements CustomCollection {
    private Node<T> top;
    private int size;

    public CustomStack() {
        this.top = null;
        size = 0;
    }

    public void push(T item) {
        Node<T> n = new Node<>(item, null);

        if (this.top == null) {
            this.top = n;
        } else {
            n.setNext(this.top);
            this.top = n;
        }
        size++;
    }

    public T top() {
        return this.top.getData();
    }

    public T pop() {
        T value = this.top.getData();
        this.top = this.top.getNext();
        size--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
}
