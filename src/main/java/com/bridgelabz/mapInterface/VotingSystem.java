package com.bridgelabz.mapInterface;

import java.util.*;

class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        System.out.println("Votes (HashMap - Unordered): " + voteMap);
        System.out.println("Votes (LinkedHashMap - Insertion Order): " + orderedVoteMap);
        System.out.println("Votes (TreeMap - Sorted Order): " + sortedVoteMap);
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayResults();
    }
}
