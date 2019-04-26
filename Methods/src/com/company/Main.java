package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //methods make code cleaner, less duplicated and easier to maintain

        //Version 1
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score is " + highScore);
        //we can set variables to the return value of methods.

        score = 10000;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score is " + highScore);

        score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        score = 1000;
        position  = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        score = 500;
        position  = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        score = 100;
        position  = calculateHighScorePosition(score);
        displayHighScorePosition("Tim", position);

        //Version 2
        /*calculateScore(true, 5000, 8, 200);
        calculateScore(true, 10000, 8, 200 );*/
    }

    /*public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);
        }
    }*/

    //the keyword "void" means that don't return or send any value
    //if I want the method to return or send a value, change the "void" with
    //data type I want the method to send or return

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
    //must include a return statement if I want the method to return a value.
    //in this case, calculateScore returns a value to where it was invoked (called),
    //i.e. inside the main function.

    //in programming terms, -1 is conventionally used to indicate an error;
    //in searching algorithms, -1 indicates value not found or invalid value.


    //Exercise:

    public static int calculateHighScorePosition(int score) {
       /* if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;*/

       int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

}
