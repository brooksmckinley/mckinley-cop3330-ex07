/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    static double FEET_TO_METERS_CONVERSION_CONSTANT = 0.09290304;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int length = scan.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = scan.nextInt();
        System.out.println(dimensionReport(length, width));
        System.out.println(areaReport(length, width));
    }

    public static String dimensionReport(int length, int width) {
        return "You entered dimensions of " + length + " feet by " + width + " feet.";
    }

    public static String areaReport(int length, int width) {
        int area = getArea(length, width);
        // Round to three significant digits to display
        String formattedMeters = String.format("%.3f", convertToMeters(area));
        return "The area is\n" +
                area + " square feet\n" +
                formattedMeters + " square meters";
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public static double convertToMeters(int feet) {
        return (double) feet * FEET_TO_METERS_CONVERSION_CONSTANT;
    }
}