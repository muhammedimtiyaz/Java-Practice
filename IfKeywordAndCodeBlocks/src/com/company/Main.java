package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean gameOver = true;
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        /*if (score == 5000) {
            System.out.println("your score was 5000");
        }*/
        //use code blocks {} even for one-liner statements


        /*if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

//        int savedFinalScore = finalScore;
        //variables created outside of a code block can be accessed inside the code block
        // but variables created inside the block cannot be accessed outside the block.... **SCOPE

        //SCOPE - accessibility of variables at certain places or certain situation.

        //Exercise:

        /*int score2 = 10_000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver) {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("your second final score is " + finalScore);
        }*/

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your second final score is " + finalScore);
        }

        //the if code block is duplicated. If I was to make changes in this code block, I would have to make changes everywhere this code was written
        //this is problematic as it can cause errors. The solution is methods.
    }
}
