package com.bridgelabz.setInterface;

import java.util.*;

public class SortedSet {
    public static void main(String[] args) {
        HashSet<Integer> elements = new HashSet<>(Arrays.asList(5,3,9,1));

        System.out.println(elements+ " sorted list " + convertToSortedList(elements));
    }

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        return new ArrayList<>(set);
    }
}
