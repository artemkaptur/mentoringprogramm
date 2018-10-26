package com.epam.mentoringprogramm;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DoesParametrFromSuiteWorkTest {

    @Parameters({"message"})
    @Test
    public void doesParametrFromSuiteWork(@Optional(value = "Something went wrong") String message) {
        Assert.assertEquals(message, "Hurrey! Parametr works!", "Paramter wasn't got from suite xml");
    }

}
