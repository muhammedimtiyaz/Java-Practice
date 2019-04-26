package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int numberToCheck = number % 10;
            number /= 10;

            if (numberToCheck % 2 == 0) {
                sum += numberToCheck;
            }
        }

        return sum;
    }
}
