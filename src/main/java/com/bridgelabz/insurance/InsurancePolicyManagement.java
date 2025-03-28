package com.bridgelabz.insurance;

import java.util.*;

public class InsurancePolicyManagement {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Policies:");
        hashSet.forEach(System.out::println);
    }

    public void displayExpiringPolicies(Date currentDate) {
        System.out.println("Policies Expiring Soon:");
        for (InsurancePolicy policy : treeSet) {
            if (policy.getExpiryDate().getTime() - currentDate.getTime() <= 30L * 24 * 60 * 60 * 1000) {
                System.out.println(policy);
            }
        }
    }

    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        for (InsurancePolicy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        System.out.println("Duplicate Policies:");
        Set<String> seen = new HashSet<>();
        for (InsurancePolicy policy : hashSet) {
            if (!seen.add(policy.getPolicyNumber())) {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.JUNE, 15);
        system.addPolicy(new InsurancePolicy("P1001", "Alice", cal.getTime(), "Health", 5000));

        cal.set(2025, Calendar.APRIL, 10);
        system.addPolicy(new InsurancePolicy("P1002", "Bob", cal.getTime(), "Auto", 3000));

        cal.set(2025, Calendar.MAY, 5);
        system.addPolicy(new InsurancePolicy("P1003", "Charlie", cal.getTime(), "Home", 7000));

        system.displayAllPolicies();
        system.displayExpiringPolicies(new Date());
        system.displayPoliciesByCoverageType("Health");
        system.findDuplicatePolicies();
    }
}
