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

    @Test()
    public void testSub() {
        Assert.assertEquals(Calculator.sub(16, 8), 8, "Invalid result of subtraction");
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
