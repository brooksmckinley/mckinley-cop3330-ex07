/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAreaConversion() {
        // Ensure that the double value is extremely close to the expected value, since testing for strict equality may
        // lead to false failures.
        Assertions.assertTrue(Math.abs(App.convertToMeters(300) - 27.871) < 0.0001);
    }

    @Test
    public void testArea() {
        Assertions.assertEquals(App.getArea(10, 40), 400);
    }

    @Test
    public void testAreaReport() {
        String expected = "The area is\n" +
                "300 square feet\n" +
                "27.871 square meters";
        String actual = App.areaReport(15, 20);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDimensionReport() {
        String expected = "You entered dimensions of 15 feet by 20 feet.";
        String actual = App.dimensionReport(15, 20);
        Assertions.assertEquals(expected, actual);
    }
}