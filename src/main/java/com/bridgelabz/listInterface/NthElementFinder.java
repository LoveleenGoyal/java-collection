package com.bridgelabz.listInterface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class NthElementFinder {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('A');
        linkedList.add('B');
        linkedList.add('C');
        linkedList.add('D');
        linkedList.add('E');

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position from the end: ");
        int n = sc.nextInt();
        sc.close();

        Character nthElement = findNthFromEnd(linkedList, n);
        System.out.println("The " + n + "th element from the end is: " + nthElement);
    }

    // Method to find Nth element from the end without calculating size
    public static Character findNthFromEnd(LinkedList<Character> list, int n) {
        ListIterator<Character> firstPointer = list.listIterator();
        ListIterator<Character> secondPointer = list.listIterator();

        // Move the first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!firstPointer.hasNext()) {
                throw new IllegalArgumentException("N is greater than the size of the list");
            }
            firstPointer.next();
        }

        // Move both pointers until the first pointer reaches the end
        while (firstPointer.hasNext()) {
            firstPointer.next();
            secondPointer.next();
        }

        return secondPointer.next();
    }
}

/*
I/P: Enter the position from the end: 3
O/P: The 3th element from the end is: C
*/