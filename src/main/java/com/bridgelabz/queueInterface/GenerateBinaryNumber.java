package com.bridgelabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        int N = 5; // Change this value to generate more binary numbers
        System.out.println("First " + N + " binary numbers: " + generateBinaryNumbers(N));
    }

    public static Queue<String> generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> result = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            result.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }
}

/*First 5 binary numbers: [1, 10, 11, 100, 101]*/