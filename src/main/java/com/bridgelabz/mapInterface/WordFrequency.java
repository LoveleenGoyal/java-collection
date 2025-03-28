package com.bridgelabz.mapInterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String filePath = "C:/Users/hp/Desktop/bridgelabz-workspace/java-collection/README.md"; // Change this to the actual file path
        Map<String, Integer> wordCountMap = countWordFrequency(filePath);

        System.out.println("Word Frequency: " + wordCountMap);
    }

    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return wordCount;
    }
}

/*
Word Frequency: {data=1, objects=1, classes=1, for=1,
iterable=1, interface=1, extended=2, java=2,
and=2, provides=1, of=2, root=1, by=2,
architecture=1, a=1, interfaces=2, set=2,
hierarchy=1, representing=1, is=3,
collection=5, it=1, store=1, list=1,
the=2, framework=2, unified=1, manipulating=1, to=1, queue=1}
* */