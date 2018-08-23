package com.raf;

public class Main {

    public static void main(String[] args) {

        int playerScore = calculateScore(true, 1000, 800, 2000);
        System.out.println("Your final score is " + playerScore + "!");

        calculateScore(false, 400, 200, 1000);

        displayHighScorePosition("Player1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player2", calculateHighScorePosition(900));
        displayHighScorePosition("Player3", calculateHighScorePosition(400));
        displayHighScorePosition("Player4", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPositionTable) {

        System.out.println(playerName + " managed to get into position " + playerPositionTable);
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
