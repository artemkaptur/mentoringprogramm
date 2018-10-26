package com.epam.mentoringprogramm;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest {

    @Test(groups = "div", dataProvider = "divDataProvider")
    public void testDiv(long firstValue, long secondValue, long expctedResult) {
        Assert.assertEquals(Calculator.div(firstValue, secondValue), expctedResult);
    }

    @Test(groups = "div", expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "/ by zero")
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
