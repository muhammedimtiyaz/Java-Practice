package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Method overloading is when you create multiple functions with the same name but
        //different numbers of parameters.

        //Method overloading is a feature that allows us to have more than one method
        //with the same name, so long as we use different parameters.

        //It is the ability to create multiple methods of the same name with different
        //implementations.

        //Calls to an overloaded method will run a specific implementation of that method.

        //when invoking the function, the number of arguments you pass and the data types of those arguments must match with
        //the definition of the function.

        //Method overloading-
            //improves code readability and re-usability;
            //makes it easier to remember one method name instead of remembering multiple names;
            //achieves consistency in naming. One name for methods that are commonly used for example "println".
            //gives programmers the flexibility to call a similar method with different types of data.



        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(0,10);
        double centimeters = calcFeetAndInchesToCentimeters(100);
        if (centimeters < 0.0) {
            System.out.println("Invalid inches");
        }

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    /*changing the return type of the function is not method overloading. e.g. changing
    public static int to public static void does not count as method overloading.
    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }*/

    //Exercise

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches.");
            return -1;
        }

        double centimeters =  ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
