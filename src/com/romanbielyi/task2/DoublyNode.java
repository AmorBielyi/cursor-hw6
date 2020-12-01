package com.romanbielyi.task2;

public class DoublyNode<T> {

    protected T data;
    protected DoublyNode<T> next, prev;
    protected int index;

    public DoublyNode(T data, DoublyNode<T> next, DoublyNode<T> prev) {

        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public DoublyNode<T> getNext() {
        return this.next;
    }

    public DoublyNode<T> getPrev() {
        return this.prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }
}
