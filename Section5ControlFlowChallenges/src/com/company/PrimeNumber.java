package com.company;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimeNumbers(int n) {
        int count = 0;
        for (int i = 2; i > 1; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

            if (count == n) break;
        }
    }
}
