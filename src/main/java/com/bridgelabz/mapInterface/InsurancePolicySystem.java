package com.bridgelabz.mapInterface;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "Number='" + policyNumber + '\'' +
                ", Holder='" + policyholderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Type='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicySystem {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, InsurancePolicy> sortedPolicyMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedPolicyMap.put(policy.expiryDate, policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getExpiringPolicies(int days) {
        LocalDate thresholdDate = LocalDate.now().plusDays(days);
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();
        for (Map.Entry<LocalDate, InsurancePolicy> entry : sortedPolicyMap.entrySet()) {
            if (entry.getKey().isBefore(thresholdDate)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedPolicyMap.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
    }

    public static void main(String[] args) {
        InsurancePolicySystem management = new InsurancePolicySystem();

        management.addPolicy(new InsurancePolicy("P1001", "John Doe", LocalDate.of(2025, 5, 20), "Health", 500.0));
        management.addPolicy(new InsurancePolicy("P1002", "Alice Smith", LocalDate.of(2024, 4, 15), "Auto", 300.0));
        management.addPolicy(new InsurancePolicy("P1003", "Bob Johnson", LocalDate.of(2024, 3, 30), "Home", 700.0));

        System.out.println("Policy by Number (P1001): " + management.getPolicyByNumber("P1001"));
        System.out.println("Policies expiring within 30 days: " + management.getExpiringPolicies(30));
        System.out.println("Policies for Alice Smith: " + management.getPoliciesByHolder("Alice Smith"));

        management.removeExpiredPolicies();
        System.out.println("Policies after removing expired ones: " + management.sortedPolicyMap);
    }
}
