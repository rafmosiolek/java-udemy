package com.raf;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32 (4 bytes)
	    int myIntVal = 5 / 3;
	    // float has a width of 32 (4 bytes)
	    float myFloatVal = 5f / 3f;
	    // double has a width of 64 (8 bytes)
	    double myDoubleVal = 5d / 3d;
        System.out.println("myIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println("myDoubleVal = " + myDoubleVal);

        double myPoundsVal = 128.3d;
        double myConversionVal = 0.45359237d;
        double myKgVal =  myPoundsVal * myConversionVal;
        System.out.println("Pounds converted to Kilograms = " + myKgVal);
    }
}
