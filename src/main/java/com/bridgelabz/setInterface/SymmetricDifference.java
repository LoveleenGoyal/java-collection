package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
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
        Set<Integer> symmetricDifferenceSet = computeSymmetricDifference(set1, set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
        System.out.println("Symmetric Difference: " + symmetricDifferenceSet);
    }

    // Method to compute the union of two sets
    public static Set<Integer> computeUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    // Method to compute the intersection of two sets
    public static <T> Set<T> computeIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    // Method to compute the symmetric difference of two sets
    public static Set<Integer> computeSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        Set<Integer> intersection = computeIntersection(set1, set2);
        symmetricDifference.removeAll(intersection);
        return symmetricDifference;
    }
}

/*
Union: [1, 2, 3, 4, 5]
Intersection: [3]
Symmetric Difference: [1, 2, 4, 5]
*/