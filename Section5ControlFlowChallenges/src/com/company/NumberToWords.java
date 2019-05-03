package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int result = 0;
        int absNumber = Math.abs(number);
        while (absNumber > 0) {
            result = (result * 10) + (absNumber % 10);
            absNumber /= 10;
        }
        if (number < 0) return -1 * result;
        return result;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}
