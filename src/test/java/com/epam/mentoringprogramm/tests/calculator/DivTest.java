package com.epam.mentoringprogramm.tests.calculator;

import static org.testng.Assert.*;

import com.epam.mentoringprogramm.calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest {

    @Test(groups = "divGroup", dataProvider = "divDataProvider")
    public void testDiv(long firstValue, long secondValue, long expctedResult) {
        assertEquals(Calculator.div(firstValue, secondValue), expctedResult, "Invalid result of division");
    }

    @Test(groups = "divGroup", expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "/ by zero")
    public void testDivByZeroThrowsException() {
        long result = Calculator.div(1, 0);
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProv() {
        return new Object[][]{
                {4, 2, 2},
                {-4, -2, 2},
                {-4, 2, -2},
        };
    }

}
