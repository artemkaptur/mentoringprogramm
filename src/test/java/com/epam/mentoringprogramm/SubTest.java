package com.epam.mentoringprogramm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest {

    @Test
    public void testSum() {
        Assert.assertEquals(Calculator.sub(16, 8), 8);
    }
    
}
