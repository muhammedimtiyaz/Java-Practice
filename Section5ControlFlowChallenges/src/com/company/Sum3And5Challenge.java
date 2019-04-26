package com.company;

public class Sum3And5Challenge {
    public static int sum(int number) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("The number divisible by both 3 and 5 is " + i);
                if (count == number) break;
            }
        }
        System.out.println("The sum of the above numbers is " + sum);
        return sum;

    }
}
