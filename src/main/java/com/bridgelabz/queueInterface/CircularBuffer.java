package com.bridgelabz.queueInterface;

import java.util.Arrays;

public class CircularBuffer {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBufferContents()));

        buffer.insert(4);
        System.out.println("Buffer after inserting 4: " + Arrays.toString(buffer.getBufferContents()));
    }

    private int[] buffer;
    private int size, start, end;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = 0;
        start = 0;
        end = 0;
    }

    public void insert(int value) {
        buffer[end] = value;
        end = (end + 1) % buffer.length;
        if (size < buffer.length) {
            size++;
        } else {
            start = (start + 1) % buffer.length;
        }
    }

    public int[] getBufferContents() {
        int[] contents = new int[size];
        for (int i = 0; i < size; i++) {
            contents[i] = buffer[(start + i) % buffer.length];
        }
        return contents;
    }
}


/*
* Buffer: [1, 2, 3]
Buffer after inserting 4: [2, 3, 4]
* */