package com.company;

public class Palindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int numberCopy = Math.abs(number);

        while (numberCopy > 0) {
            reverse = (reverse * 10) + (numberCopy % 10);
            numberCopy /= 10;
        }

        return reverse == Math.abs(number);
    }
}
