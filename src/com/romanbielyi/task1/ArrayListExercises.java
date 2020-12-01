package com.romanbielyi.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {
    public static void ArrayListExercisesShow() {
        System.out.println("********* ArrayList exercises **********");
        System.out.println("Exercise #1");
        ArrayList<String> list = new ArrayList<>();
        list.add("RED");
        list.add("BLUE");
        list.add("MAGENTA");
        list.add("PURPLE");
        list.add("ORANGE");
        list.add("TERRACOTTA");

        System.out.println(list);

        System.out.println("Exercise #2");
        for (String color : list) {
            System.out.printf("Color: %s\n", color);
        }

        System.out.println("Exercise #3");
        list.add(0, "FUCHSIA");
        System.out.println(list);

        System.out.println("Exercise #4");
        System.out.printf("The fifth color is %s\n", list.get(4));

        System.out.println("Exercise #5");
        list.set(4, "BLACK");
        System.out.println(list);

        System.out.println("Exercise #6");
        list.remove(2);
        System.out.println(list);

        System.out.println("Exercise #7");
        if (list.contains("TERRACOTTA")) {
            System.out.println("There is TERRACOTTA color");
        } else {
            System.out.println("There isn't TERRACOTTA color");
        }

        System.out.println("Exercise #8");
        System.out.printf("List before sort: %s\n", list);
        Collections.sort(list);
        System.out.printf("List after sort: %s\n", list);

        System.out.println("Exercise #9");
        List<String> secondList = new ArrayList<>();
        secondList.add("ALPHA");
        secondList.add("OMEGA");
        secondList.add("DELTA");
        secondList.add("CHARLY");
        secondList.add("FOXTROT");

        System.out.printf("Before copy: %s\n", list);
        Collections.copy(list, secondList);
        System.out.printf("After copy: %s\n", list);

        System.out.println("Exercise #10");
        System.out.printf("Before shuffling: %s\n", list);
        Collections.shuffle(list);
        System.out.printf("After shuffling: %s\n", list);

        System.out.println("Exercise #11");
        System.out.printf("Before reversing %s\n", list);
        Collections.reverse(list);
        System.out.printf("After reversing %s\n", list);

        System.out.println("Exercise #12");
        System.out.printf("Original list %s\n", list);
        List<String> subList;
        subList = list.subList(0, 3);
        System.out.printf("Sublist %s\n", subList);

        System.out.println("Exercise #13");
        if (list.equals(subList)) {
            System.out.println("list == subList");
        } else {
            System.out.println("list != sublist");
        }

        System.out.println("Exercise #13");
        List<String> resultCmp = new ArrayList<>();
        subList.add("TERRACOTTA");
        for (String elem : list) {
            resultCmp.add(subList.contains(elem) ? "YES" : "NO");
        }
        System.out.println(resultCmp);

        System.out.println("Exercise #14");
        System.out.printf("List before swapping: %s\n", list);
        Collections.swap(list, 3, list.size() - 1);
        System.out.printf("List after swapping: %s\n", list);

        System.out.println("Exercise #15");
        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(list);
        mergedList.addAll(subList);
        System.out.printf("Merged list: %s\n", mergedList);

        System.out.println("Exercise #16");
        System.out.printf("Original list: %s\n", list);
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.printf("Cloned list: %s\n", clonedList);

        System.out.println("Exercise #17");
        System.out.printf("Before clearing %s\n", list);
        mergedList.clear();
        System.out.printf("After clearing %s\n", list);

        System.out.println("Exercise #18");
        if (mergedList.isEmpty()) {
            System.out.println("mergedList is empty");
        } else {
            System.out.println("mergedList isn't empty");
        }

        System.out.println("Exercise #19");
        System.out.printf("List before trimming %s\n", list);
        list.trimToSize();
        System.out.printf("List after trimming %s\n", list);

        System.out.println("Exercise #20");
        System.out.printf("List before ensuring capacity %s\n", list);
        list.ensureCapacity(2);
        list.add("GRAY");
        list.add("DARK BLUE");
        System.out.printf("List after ensuring capacity %s\n", list);

        System.out.println("Exercise #21");
        System.out.printf("List before replacing %s\n", list);
        list.set(1, "WHITE");
        System.out.printf("List after replacing %s\n", list);

        System.out.println("Exercise #22");
        System.out.println("Iterating list by indices");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Elem %d = %s\n", i + 1, list.get(i));
        }
    }
}
