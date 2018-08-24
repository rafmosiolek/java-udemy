package com.raf;

public class Main {

    public static void main(String[] args) {

        int newScore = calculatedScore("John", 800);
        System.out.println("New score is " + newScore);
        calculatedScore(10);
        calculatedScore();

        calcFeetAndInchesToCentimeters(2, 11);
        calcFeetAndInchesToCentimeters(10);
    }

    public static int calculatedScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculatedScore(int score) {
        System.out.println("Unnamed player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculatedScore() {
        System.out.println("No player, no score lol");
        return 0;
    }

    //*********************************************//

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if ( feet < 0 || inches < 0 || inches > 12) {
            return -1d;
        }
        double inchToCmConverterVal = 2.54d;
        double feetToInchConverterVal = 12d;

        double convertedInches = feet * feetToInchConverterVal + inches;
        double centimeters = convertedInches * inchToCmConverterVal;
        System.out.println(centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        if (inches < 0) {
            return -1d;
        }
        double inchToCmConverterVal = 2.54d;

        double convertedInches = inches;
        double centimeters = convertedInches * inchToCmConverterVal;
        System.out.println(centimeters);
        return centimeters;
    }
}
