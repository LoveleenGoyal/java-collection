package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);

        List<Integer> uniqueList = removeDuplicates(list) ;
        System.out.println(list + " After removing duplicates from list -> " + uniqueList);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}

/*[3, 1, 2, 3, 1, 4] After removing duplicates from list -> [3, 1, 2, 4]*/