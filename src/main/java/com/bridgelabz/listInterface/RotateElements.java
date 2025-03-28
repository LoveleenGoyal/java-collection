package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElements {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();

        numlist.add(10);
        numlist.add(20);
        numlist.add(30);
        numlist.add(40);
        numlist.add(50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rotate factor: ");
        int rotate = sc.nextInt();
        sc.close();

        List<Integer> rotatedList = rotateElements(numlist, rotate);
        System.out.println("Elements of list: " + numlist + " rotated by " + rotate + " -> " + rotatedList);
    }

    // Method to rotate the elements in list
    public static List<Integer> rotateElements(List<Integer> list, int rotate) {
        List<Integer> tempList = new ArrayList<>(list);
        int size = tempList.size();
        rotate = rotate % size; // Handle cases where rotate is greater than list size

        List<Integer> rotateList = new ArrayList<>(tempList.subList(rotate, size));
        rotateList.addAll(tempList.subList(0, rotate));

        return rotateList;
    }
}

/*Enter the rotate factor: 2
Elements of list: [10, 20, 30, 40, 50] rotated by 2 -> [30, 40, 50, 10, 20]*/