package com.company;

public class InterestRate {

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static void printInterests(int amount) {
        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(amount, i)));
        }
    }

    public static void printInterestInReverse(int amount) {
        for (int i = 8; i > 1; i--) {
            System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(amount, i)));
        }
    }
}
