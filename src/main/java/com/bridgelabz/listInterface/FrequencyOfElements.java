package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Apple");
        elements.add("Banana");
        elements.add("Orange");
        elements.add("Mango");
        elements.add("Mango");
        elements.add("Apple");

        Map<String, Integer> result = countFrequency(elements);
        System.out.println("Word Frequencies: " + result);
    }

    // Method to check the frequency of elements
    public static Map<String, Integer> countFrequency(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}


/*Word Frequencies: {Apple=2, Mango=2, Orange=1, Banana=1}*/