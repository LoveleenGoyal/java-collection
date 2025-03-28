package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class EqualChecker {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(1);

        boolean equality = checkEquality(set1,set2);
        System.out.println(set1 + " and " + set2 + " -> " + equality);
    }

    public static boolean checkEquality(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
}

/*[1, 2, 3] and [1, 3, 4] -> false*/