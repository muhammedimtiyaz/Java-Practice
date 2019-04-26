package com.company;

public class WhileChallenge {

    public static boolean isEven(int num) {
        if (num % 2 == 0) return true;
        return false;
    }

    public static int printEvenNumbersAndCount() {
        int start = 4;
        int end = 20;
        int count = 0;

        while (start <= end && count < 5) {
            if (isEven(start)) {
                count++;
                System.out.println("Even number " + start);
            }

            start++;
        }

        return count;
    }
}
