package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        while (num1 > 0) {
            int num2Copy = num2;
            int digit1 = num1 % 10;

            while (num2Copy > 0) {
                int digit2 = num2Copy % 10;
                num2Copy /= 10;

                if (digit1 == digit2) {
                    return true;
                }
            }
            num1 /= 10;
        }

        return false;
    }
}
