package com.epam.mentoringprogramm.tests;

import static org.testng.Assert.*;

import com.epam.mentoringprogramm.calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubTest {

    private long valueOne;

    private long valueTwo;

    private long expectedResult;

    @Factory(dataProvider = "subDataProvider")
    public SubTest(long valueOne, long valueTwo, long expectedResult) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.expectedResult = expectedResult;
    }

    @Test()
    public void testSub() {
        assertEquals(Calculator.sub(valueOne, valueTwo), expectedResult, "Invalid result of subtraction");
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] subDataProv() {
        return new Object[][]{
                {1, 1, 0},
                {-1, -1, 0},
                {-1, 1, -2},
        };
    }

}
