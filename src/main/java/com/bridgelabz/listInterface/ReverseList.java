package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));

        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));

    }

    // Method to reverse elements using arraylist
    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    // Method to reverse elements using linked-list
    public static <T> List<T> reverseLinkedList(List<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (T item : list) {
            reversedList.addFirst(item);
        }
        return reversedList;
    }

}

/*
Original ArrayList: [1, 2, 3, 4, 5]
Reversed ArrayList: [5, 4, 3, 2, 1]
Original LinkedList: [1, 2, 3, 4, 5]
Reversed LinkedList: [5, 4, 3, 2, 1]
*/