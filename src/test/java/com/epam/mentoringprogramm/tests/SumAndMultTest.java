package com.epam.mentoringprogramm.tests;

import static org.testng.Assert.*;

import com.epam.mentoringprogramm.calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumAndMultTest {

    @Test(dataProvider = "sumDataProvider")
    public void testSum(long firstValue, long secondValue, long expectedResult) {
        assertEquals(Calculator.sum(firstValue, secondValue), expectedResult, "Invalid result of sum");
    }

    @Test(dataProvider = "multDataProvider", dependsOnMethods = "testSum")
    public void testMult(long firstValue, long secondValue, long expectedResult) {
        assertEquals(Calculator.mult(firstValue, secondValue), expectedResult, "Invalid result of multiplication");
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProv() {
        return new Object[][]{
                {1, 1, 2},
                {-1, -1, -2},
                {-1, 1, 0},
        };
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProv() {
        return new Object[][]{
                {1, 2, 2},
                {-1, -2, 2},
                {-1, 2, -2},
        };
    }

}
