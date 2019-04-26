package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//
//        int smaller = first < second ? first : second;
//        int greatest = 1;
//        int divisor = 1;
//        while (divisor <= smaller) {
//            if (first % divisor == 0 && second % divisor == 0) {
//                greatest = divisor;
//            }
//            divisor++;
//        }
//
//        return greatest;

        if (first < 10 || second < 10) {
            return -1;
        }

        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }
}
