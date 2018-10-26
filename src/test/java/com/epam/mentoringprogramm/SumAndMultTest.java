package com.epam.mentoringprogramm;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumAndMultTest {

    @Test(groups = "CalcTest", dataProvider = "sumDataProvider")
    public void testSum(long firstValue, long secondValue, long expectedResult) {
        Assert.assertEquals(Calculator.sum(firstValue, secondValue), expectedResult);
    }

    @Test(dataProvider = "multDataProvider", dependsOnMethods = "testSum")
    public void testMultLong(long firstValue, long secondValue, long expectedResult) {
        Assert.assertEquals(Calculator.mult(firstValue, secondValue), expectedResult);
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
