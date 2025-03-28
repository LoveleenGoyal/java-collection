package com.bridgelabz.queueInterface;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));

        triageQueue.add(new Patient("Dia", 3));
        triageQueue.add(new Patient("Love", 5));
        triageQueue.add(new Patient("Ria", 2));

        System.out.println("Order of treatment:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}

/*
* Order of treatment:
Love (Severity: 5)
Dia (Severity: 3)
Ria (Severity: 2)

* */