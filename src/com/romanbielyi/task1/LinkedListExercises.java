package com.romanbielyi.task1;

import java.util.*;

public class LinkedListExercises {
    public static void LinkedListExercisesShow() {
        System.out.println("********* LinkedList exercises **********");
        System.out.println("Exercise #1");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Andromeda");
        linkedList.add("Epsilon Eridana");
        linkedList.add("Glise 86");
        linkedList.add("Zeta Reticuli");
        linkedList.add("Tau Ceti");
        System.out.println(linkedList);

        System.out.println("Exercise #2");
        for (String elem : linkedList) {
            System.out.printf("%s\n", elem);
        }

        System.out.println("Exercise #3");
        Iterator<String> iter = linkedList.listIterator(2);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Exercise #4");

        Iterator<String> descendInter = linkedList.descendingIterator();
        while (descendInter.hasNext()) {
            System.out.println(descendInter.next());
        }

        System.out.println("Exercise #5");
        System.out.printf("LinkedList before inserting %s\n", linkedList);
        linkedList.add(4, "Milky Way");
        System.out.printf("LinkedList after inserting %s\n", linkedList);

        System.out.println("Exercise #6");
        System.out.printf("LinkedList before inserting %s\n", linkedList);
        linkedList.addFirst("Sirius B");
        linkedList.addLast("Regulus");
        System.out.printf("LinkedList after inserting %s\n", linkedList);

        System.out.println("Exercise #7");
        System.out.printf("LinkedList before inserting %s\n", linkedList);
        linkedList.offerFirst("Aldebaran");
        System.out.printf("LinkedList after inserting %s\n", linkedList);

        System.out.println("Exercise #8");
        System.out.printf("LinkedList before inserting %s\n", linkedList);
        linkedList.offerLast("Orion Galaxy");
        System.out.printf("LinkedList after inserting %s\n", linkedList);

        System.out.println("Exercise #9");
        System.out.printf("LinkedList before inserting %s\n", linkedList);
        linkedList.add(2, "Alpha Centauri");
        linkedList.add(4, "Kepler 33");
        System.out.printf("LinkedList after inserting %s\n", linkedList);

        System.out.println("Exercise #10");
        System.out.printf("LinkedList %s\n", linkedList);
        String firstElem = linkedList.getFirst();
        String lastElem = linkedList.getLast();
        System.out.printf("LinkedList first elem %s\n", firstElem);
        System.out.printf("LinkedList first elem %s\n", lastElem);

        System.out.println("Exercise #11");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.printf("linkedList[%d] %s\n", i + 1, linkedList.get(i));
        }

        System.out.println("Exercise #12");
        System.out.printf("LinkedList before removing elem 4 %s\n", linkedList);
        linkedList.remove(3);
        System.out.printf("LinkedList after removing elem 4 %s\n", linkedList);

        System.out.println("Exercise #13");
        System.out.printf("LinkedList before removing first and last %s\n", linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.printf("LinkedList after removing first and last %s\n", linkedList);

        System.out.println("Exercise #14");
        LinkedList<String> secondLinkedList = new LinkedList<>(Arrays.asList("A", "B"));

        System.out.printf("LinkedList before removing all elems %s\n", secondLinkedList);
        secondLinkedList.clear();
        System.out.printf("LinkedList after removing all elems %s\n", secondLinkedList);

        System.out.println("Exercise #15");
        System.out.printf("LinkedList before swapping %s\n", linkedList);
        Collections.swap(linkedList, 0, 3);
        System.out.printf("LinkedList after swapping %s\n", linkedList);

        System.out.println("Exercise #16");
        System.out.printf("LinkedList before shuffling %s\n", linkedList);
        Collections.shuffle(linkedList);
        System.out.printf("LinkedList after shuffling %s\n", linkedList);

        System.out.println("Exercise #17");
        LinkedList<String> joinedList = new LinkedList<>();
        List<String> partOfList = linkedList.subList(2, 4);
        joinedList.addAll(linkedList);
        joinedList.addAll(partOfList);
        System.out.printf("%s\n+\n%s\n=\n%s\n", linkedList, partOfList, joinedList);

        System.out.println("Exercise #18");
        LinkedList newList = (LinkedList) joinedList.clone();
        System.out.printf("LinkedList original %s\n", joinedList);
        System.out.printf("Linked list clone %s\n", newList);

        System.out.println("Exercise #19");
        System.out.printf("LinkedList before removing %s\n", joinedList);
        System.out.printf("LinkedList, element to remove %s\n", joinedList.pop());
        System.out.printf("LinkedList after removing %s\n", joinedList);

        System.out.println("Exercise #20");
        System.out.printf("LinkedList %s\n", joinedList);
        System.out.printf("First element %s\n", joinedList.peekFirst());
        System.out.printf("LinkedList again %s\n", joinedList);

        System.out.println("Exercise #21");
        System.out.printf("LinkedList %s\n", joinedList);
        System.out.printf("First element %s\n", joinedList.peekLast());
        System.out.printf("LinkedList again %s\n", joinedList);

        System.out.println("Exercise #22");
        if (linkedList.contains("Zeta Reticuli")) {
            System.out.println("Linked list contains Zeta Reticuli");
        } else {
            System.out.println("Linked list doesn't contain Zeta Reticuli");
        }

        System.out.println("Exercise #23");
        List<String> list = new ArrayList<>(joinedList);
        for (String e : list) {
            System.out.println(e);
        }
        System.out.println("Exercise #24");
        List<String> clonedLinkedList = (LinkedList<String>) joinedList.clone();
        if (joinedList.equals(clonedLinkedList)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
        System.out.println("Exercise #25");
        if (joinedList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        System.out.println("Exercise #26");
        System.out.printf("LinkedList before replacing %s\n", joinedList);
        joinedList.set(3, "Fabula Ceti");
        System.out.printf("LinkedList after replacing %s\n", joinedList);
    }
}
