package com.epam.mentoringprogramm.tests.calculator;

import static org.testng.Assert.*;

import com.epam.mentoringprogramm.annotations.IgnoreThisTest;
import com.epam.mentoringprogramm.calculator.Calculator;
import org.testng.annotations.Test;

public class PositiveNegativeTest {

    private long value;

    private boolean expectedToBePositive;

    private boolean expectedToBeNegative;

    public PositiveNegativeTest(long value, boolean expectedToBePositive, boolean expectedToBeNegative) {
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test
    public void checkValuePositive() {
        assertTrue(Calculator.isPositive(value) == expectedToBePositive);
    }

    @IgnoreThisTest
    @Test
    public void checkValueNegative() {
        assertTrue(Calculator.isNegative(value) == expectedToBeNegative);
    }

}
