package com.company;

public class Main {

    public static void main(String[] args) {

        //operators are special symbols that performs specific operations
        //on one, two or three operands, and then return a result.

        //Examples: =, +, -, *, /, +=, ++, --, -=, *=, /=, =, ==, !=, >, <, >=, <=, &&, ||,

        int result = 1 + 2;

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result ++;
        System.out.println("Result is now " + result);
        result --;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien");
        else
            System.out.println("It IS an alien!");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");
        //&& - both conditions must be true to get true.

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these test is true");
        // || - only one of the conditions need to be true to get true.

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen!");

        //ternary operator
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double variable1 = 20d;
        double variable2 = 80d;
        double exerciseResult = (variable1 + variable2) * 25d;
        System.out.println("exerciseResult = " + exerciseResult);
        exerciseResult = exerciseResult % 40;
        if (exerciseResult <= 20)
            System.out.println("Total was over the limit");
    }
}
