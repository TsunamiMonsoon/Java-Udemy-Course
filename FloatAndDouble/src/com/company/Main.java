package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Float min value: " + myMinFloatVal + " Float max value: " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double min value: " + myMinDoubleVal + " Double max value: " + myMaxDoubleVal);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d;
        System.out.println("MyIntVal = " + myIntVal + "\nMyFLoatVal = " + myFloatVal + "\nMyDoubleVal = " + myDoubleVal);

        double numOfPounds = 200d;
        double convertedKilos = numOfPounds * .45359237d;
        System.out.println("Converted Kilos: " + convertedKilos);
    }
}
