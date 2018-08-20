package com.raf;

public class Main {

    public static void main(String[] args) {
	    // primitive data types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean


        // **************
        // String class

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2018";
        System.out.println(myString);

        String myNumString = "200.05";
        myNumString = myNumString + "99.95";
        System.out.println(myNumString);

        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt;
        System.out.println(myLastString);

    }
}
