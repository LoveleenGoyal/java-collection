package com.bridgelabz.setInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = checkSubset(set1,set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println("Is set1 is subset of set2: " + isSubset);
    }

    public static boolean checkSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}

/*
[2, 3]
[1, 2, 3, 4]
Is set1 is subset of set2: true
*/