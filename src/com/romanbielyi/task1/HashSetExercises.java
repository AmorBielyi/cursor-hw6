package com.romanbielyi.task1;

import java.util.*;

public class HashSetExercises {
    public static void HashSetExercisesShow() {
        System.out.println("********* HashSet exercises **********");
        System.out.println("Exercise #1");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Crocodile");
        hashSet.add("Alpaca");
        hashSet.add("Giraffe");
        hashSet.add("Snake");
        System.out.println(hashSet);
        System.out.println("Exercise #2");
        System.out.println("The HashSet elems are");
        for (String e : hashSet) {
            System.out.println(e);
        }
        System.out.println("Exercise #3");
        System.out.printf("HashSet contains %d elements\n", hashSet.size());

        System.out.println("Exercise #4");
        System.out.printf("HashSet before clearing %s\n", hashSet);
        hashSet.clear();
        System.out.printf("HashSet after clearing %s\n", hashSet);

        System.out.println("Exercise #5");
        if (hashSet.isEmpty()) {
            System.out.println("HasSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        System.out.println("Exercise #6");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("E");
        HashSet<String> clonedHashSet = (HashSet<String>) hashSet.clone();
        System.out.printf("HashSet orig %s\n", hashSet);
        System.out.printf("HashSet cloned %s\n", clonedHashSet);

        System.out.println("Exercise #7");
        System.out.printf("HashSet orig %s\n", clonedHashSet);
        String[] arr = new String[clonedHashSet.size()];
        clonedHashSet.toArray(arr);
        System.out.println("New array from HashSet is");
        for (String e : arr) {
            System.out.println(e);
        }

        System.out.println("Exercise #8");
        Set<String> tree_set = new TreeSet<>(hashSet);
        System.out.printf("Tree set from has set %s\n", tree_set);

        System.out.println("Exercise #9");
        List<String> array_list = new ArrayList<>(hashSet);
        System.out.printf("Array list from has set %s\n", array_list);

        System.out.println("Exercise #10");
        Set<String> secondHashSet = new HashSet<>();
        secondHashSet.add("E");
        secondHashSet.add("A");
        secondHashSet.add("Z");

        if (hashSet.equals(secondHashSet)) {
            System.out.println("HashSet  equals");
        } else {
            System.out.println("HashSet not equals");
        }

        System.out.println("Exercise #11");
        System.out.printf("HasSet %s\nintersects\n", hashSet);
        hashSet.retainAll(secondHashSet);
        System.out.printf("HasSet %s\n", secondHashSet);

        System.out.printf("HashSet intersection is: %s\n", hashSet);


        System.out.println("Exercise #12");
        System.out.printf("HashSet before removing all elements %s\n", hashSet);
        hashSet.clear();
        System.out.printf("HashSet before after removing all elements %s\n", hashSet);

    }
}
