package com.bridgelabz.mapInterface;

import java.util.*;

class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void withdraw(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            double balance = accounts.get(accountNumber);
            System.out.println("Processing withdrawal for account: " + accountNumber + " | Balance: " + balance);
        }
    }

    public void displayAccounts() {
        System.out.println("Customer Accounts (HashMap - Unordered): " + accounts);
        System.out.println("Accounts Sorted by Balance (TreeMap): " + sortedAccounts);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(101, 5000.0);
        bank.createAccount(102, 3000.0);
        bank.createAccount(103, 7000.0);
        bank.createAccount(104, 2000.0);

        bank.withdraw(102, 500.0);
        bank.withdraw(103, 1000.0);

        bank.displayAccounts();
        bank.processWithdrawals();
    }
}


/*Customer Accounts (HashMap - Unordered): {101=5000.0, 102=3000.0, 103=7000.0, 104=2000.0}
Accounts Sorted by Balance (TreeMap): {2000.0=104, 3000.0=102, 5000.0=101, 7000.0=103}
Processing withdrawal for account: 102 | Balance: 3000.0
Processing withdrawal for account: 103 | Balance: 7000.0*/