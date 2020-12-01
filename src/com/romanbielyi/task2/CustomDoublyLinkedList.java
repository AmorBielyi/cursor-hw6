package com.romanbielyi.task2;

public class CustomDoublyLinkedList<T> implements CustomCollection {
    private int size;
    private int index;
    private T data;
    private DoublyNode<T> front, rear;

    public CustomDoublyLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    public void addFirst(T data) {
        DoublyNode<T> n = new DoublyNode<>(data, front, null);
        if (this.front != null) {
            n.index = index;
            this.front.prev = n;
        }
        this.front = n;
        if (this.rear == null) {
            n.index = index;
            this.rear = n;
        }
        size++;
        index++;
    }


    public void addLast(T data) {
        DoublyNode<T> n = new DoublyNode<>(data, null, this.rear);
        if (this.rear != null) {
            this.rear.next = n;
        }
        this.rear = n;
        if (this.front == null) {
            this.front = n;
        }
        size++;
    }

//    public void add(int index, T item) {
//        DoublyNode<T> current = this.rear;
//        while(current != null){
//            System.out.printf("index: %d\n", current.index);
//            if(current.index == index){
//                current.data = item;
//                return;
//            }
//
//            current = current.prev;
//        }
//        //throw new IndexOutOfBoundsException();
//    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("{ ");
        DoublyNode<T> current = this.front;
        while (current != null) {
            str.append(current.data + " ");
            current = current.next;
        }
        str.append("}");

        return str.toString();
    }
}
