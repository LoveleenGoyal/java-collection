package com.bridgelabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        queue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return queue;
        }
        Integer item = queue.remove();
        queue = reverseQueue(queue);
        queue.add(item);
        return queue;
    }
}

/*
Original Queue: [10, 20, 30]
Reversed Queue: [30, 20, 10]
*/