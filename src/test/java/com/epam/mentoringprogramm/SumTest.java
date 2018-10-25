package com.epam.mentoringprogramm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {

    @Test(groups = "CalcTest")
    public void testSum() {
        Assert.assertEquals(Calculator.sum(8, 8), 16);
    }

}
