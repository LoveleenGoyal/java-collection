package com.bridgelabz.mapInterface;

import java.util.*;

public class HighestValueKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = getMaxKey(map);
        System.out.println("Key with the highest value: " + maxKey);
    }

    public static String getMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

/*Key with the highest value: B*/