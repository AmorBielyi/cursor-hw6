package com.romanbielyi.task2;

public class Task2 {
    private static void showCollectionStatus(CustomCollection customCollection) {
        if (customCollection.isEmpty()) {
            System.out.println(" Is empty");
        } else {
            System.out.println("Is not empty");
        }
    }

    public static void PlayWithCustomDoublyLinkedList() {
        System.out.println("*** DoublyLinkedList based Queue ***");
        CustomDoublyLinkedList<Integer> customDoublyLinkedList = new CustomDoublyLinkedList<>();
        customDoublyLinkedList.addFirst(-1);
        customDoublyLinkedList.addFirst(-2);
        customDoublyLinkedList.addFirst(-3);
        customDoublyLinkedList.addFirst(-4);
        customDoublyLinkedList.addFirst(-5);
        System.out.println("Printing out whole linked list");
        System.out.println(customDoublyLinkedList);
        System.out.println("add at index 1");
        //customDoublyLinkedList.add(1,-100);

        //System.out.println(customDoublyLinkedList);
        customDoublyLinkedList.addFirst(-1000);
        customDoublyLinkedList.addLast(-1500);
        System.out.println(customDoublyLinkedList);
    }

    public static void PlayWithCustomQueue() {
        System.out.println("*** SingleLinkedList based Queue ***");
        CustomQueue<Integer> customQueue = new CustomQueue<>();
        customQueue.enqueue(-1);
        customQueue.enqueue(-2);
        customQueue.enqueue(-3);
        customQueue.enqueue(-4);
        customQueue.enqueue(-5);
        System.out.printf("front: %d, rear: %d, size: %d\n", customQueue.front(), customQueue.rear(), customQueue.size());
        System.out.printf("dequeue element: %d, size: %d\n", customQueue.dequeue(), customQueue.size());
        System.out.printf("front: %d, rear: %d\n", customQueue.front(), customQueue.rear());
        showCollectionStatus(customQueue);

        while (!customQueue.isEmpty()) {
            System.out.printf("I am removing %d\n", customQueue.dequeue());
        }
        System.out.printf("size is: %s\n", customQueue.size());

        showCollectionStatus(customQueue);

    }

    public static void PlayWithCustomStack() {
        System.out.println("*** SinglyLinkedList based Stack ***");
        CustomStack<Integer> customStack = new CustomStack<>();
        customStack.push(-1);
        customStack.push(-2);
        customStack.push(-3);
        customStack.push(-4);
        customStack.push(-5);
        System.out.printf("top: %d, size: %d\n", customStack.top(), customStack.size());
        System.out.printf("pop: %d, size: %d\n", customStack.pop(), customStack.size());
        System.out.printf("top of the stack %d\n", customStack.top());

        showCollectionStatus(customStack);

        while (!customStack.isEmpty()) {
            System.out.printf("I am removing %d\n", customStack.pop());
        }
        System.out.printf("size is: %s\n", customStack.size());

        showCollectionStatus(customStack);
    }

    public static void main(String[] args) {
        PlayWithCustomStack();
        PlayWithCustomQueue();
        PlayWithCustomDoublyLinkedList();
    }
}
