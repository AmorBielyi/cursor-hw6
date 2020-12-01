package com.romanbielyi.task2;

public class CustomQueue<T> implements CustomCollection {
    private Node<T> front, rear;
    private int size = 0;

    public CustomQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public T dequeue() {
        T value = front.getData();
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        size--;
        return value;
    }

    public void enqueue(T data) {
        Node<T> oldPrev = rear;
        rear = new Node<>(data, null);
        if (isEmpty()) {
            front = rear;
        } else {
            oldPrev.next = rear;
        }
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    public T front() {
        return this.front.getData();
    }

    public T rear() {
        return this.rear.getData();
    }

}
