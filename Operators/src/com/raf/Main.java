package com.raf;

public class Main {

    public static void main(String[] args) {

        double myTwentyVal = 20d;
        double myEightyVal = 80d;

        double myTotalVal = (myTwentyVal + myEightyVal) * 25d;
        System.out.println(myTotalVal);

        double myTotalRemainder = myTotalVal % 40;
        System.out.println(myTotalRemainder);

        if (myTotalRemainder <= 20) {
            System.out.println("Total was over the limit!");
        }

    }
}
