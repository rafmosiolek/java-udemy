package com.raf;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 1000, 800, 2000);
        calculateScore(false, 400, 200, 1000);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore + "!");
            return finalScore;
        }

        return -1;
    }
}
