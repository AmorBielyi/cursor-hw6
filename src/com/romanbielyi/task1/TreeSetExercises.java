package com.romanbielyi.task1;

import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercises {
    public static void TreeSetExercisesShow() {
        System.out.println("********* TreeSet exercises **********");
        System.out.println("Exercise #1");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("RED");
        treeSet.add("GREEN");
        treeSet.add("BLUE");
        treeSet.add("WHITE");
        treeSet.add("MAGENTA");
        System.out.println(treeSet);

        System.out.println("Exercise #2");
        for (String e : treeSet) {
            System.out.println(e);
        }
        System.out.println("Exercise #3");
        TreeSet<String> secondTreeSet = new TreeSet<>();
        secondTreeSet.add("RED");
        secondTreeSet.add("VIOLET");
        System.out.printf("TreeSet before adding another one %s\n", treeSet);
        treeSet.addAll(secondTreeSet);
        System.out.printf("TreeSet after adding another one %s\n", treeSet);

        System.out.println("Exercise #4");
        Iterator<String> reverseIter = treeSet.descendingIterator();
        System.out.println("Reversed TreeSet");
        while (reverseIter.hasNext()) {
            System.out.println(reverseIter.next());
        }
        System.out.println("Exercise #5");
        System.out.printf("TreeSet orig %s\n", treeSet);
        System.out.printf("TreeSet first elem %S\n", treeSet.first());
        System.out.printf("TreeSet last elem %S\n", treeSet.last());

        System.out.println("Exercise #6");
        TreeSet<String> clonedTreeSet = (TreeSet<String>) treeSet.clone();
        System.out.printf("TreeSet orig %s\n", treeSet);
        System.out.printf("TreeSet cloned %s\n", clonedTreeSet);

        System.out.println("Exercise #7");
        System.out.printf("TreeSet contains %d elements\n", treeSet.size());

        System.out.println("Exercise #8");
        if (treeSet.equals(clonedTreeSet)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        System.out.println("Exercise #9");
        TreeSet<Integer> numTreeSet = new TreeSet<>();
        TreeSet<Integer> headNumTreeSet = new TreeSet<>();
        numTreeSet.add(5);
        numTreeSet.add(15);
        numTreeSet.add(9);
        numTreeSet.add(-5);
        numTreeSet.add(-554);
        headNumTreeSet = (TreeSet<Integer>) numTreeSet.headSet(7);

        for (Integer integer : headNumTreeSet) {
            System.out.println(integer);
        }


        System.out.println("Exercise #10");
        System.out.printf("Greater than or equal to 4: %d\n", numTreeSet.ceiling(4));

        System.out.println("Exercise #11");
        System.out.printf("Less than or equal to -5: %d\n", numTreeSet.ceiling(-5));

        System.out.println("Exercise #12");
        System.out.printf("Strictly greater than -5: %d\n", numTreeSet.higher(-5));

        System.out.println("Exercise #13");
        System.out.printf("Strictly less than -5: %d\n", numTreeSet.lower(-5));

        System.out.println("Exercise #14");
        System.out.printf("Element to remove (first) %s\n", numTreeSet.pollFirst());
        System.out.printf("After removing %s\n", numTreeSet);

        System.out.println("Exercise #15");
        System.out.printf("Element to remove (last) %s\n", numTreeSet.pollLast());
        System.out.printf("After removing %s\n", numTreeSet);

        System.out.println("Exercise #16");
        System.out.printf("Before removing 9 %s\n", numTreeSet);
        numTreeSet.remove(9);
        System.out.printf("After removing 9 %s\n", numTreeSet);

    }
}
