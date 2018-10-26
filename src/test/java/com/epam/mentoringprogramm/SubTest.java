package com.epam.mentoringprogramm;

import org.testng.Assert;
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

    @Test(groups = "CalcTest")
    public void testSum() {
        Assert.assertEquals(Calculator.sub(16, 8), 8);
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] sumDataProv() {
        return new Object[][]{
                {1, 1, 0},
                {-1, -1, 0},
                {-1, 1, -2},
        };
    }

}
