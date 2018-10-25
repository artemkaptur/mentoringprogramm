package com.epam.mentoringprogramm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest {

    @Test(groups = "CalcTest")
    public void testSum() {
        Assert.assertEquals(Calculator.sub(16, 8), 8);
    }

}
