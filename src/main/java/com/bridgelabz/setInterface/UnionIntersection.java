package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = computeUnion(set1, set2);
        Set<Integer> intersectionSet = computeIntersection(set1, set2);

        System.out.println(set1 + " and " + set2 + " -> Union: " + unionSet);
        System.out.println(set1 + " and " + set2 + " -> Intersection: " + intersectionSet);
    }

    // Method to compute the union of two sets
    public static Set<Integer> computeUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    // Method to compute the intersection of two sets
    public static Set<Integer> computeIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}

/*
[1, 2, 3] and [3, 4, 5] -> Union: [1, 2, 3, 4, 5]
[1, 2, 3] and [3, 4, 5] -> Intersection: [3]
*/