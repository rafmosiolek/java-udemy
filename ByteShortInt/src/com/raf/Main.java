package com.raf;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;
	    int myNewIntVal = (myMinValue / 2);
        System.out.println("myNewIntVal: " + myNewIntVal);

	    // byte has a width of 8
	    byte myMinByteValue = -128;
	    byte myMaxByteValue = 127;
	    byte myNewByteVal = (byte) (myMinByteValue / 2);
        System.out.println("myNewByteVal: " + myNewByteVal);

	    // short has a width of 16
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;
        short myNewShortVal = (short) (myMinShortValue / 2);

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;


    }
}
