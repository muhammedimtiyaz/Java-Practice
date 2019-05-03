package com.company;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value");
        }

        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
        }
    }
}
