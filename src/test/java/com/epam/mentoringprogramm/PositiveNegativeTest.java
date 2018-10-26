package com.epam.mentoringprogramm;

import static org.testng.Assert.*;

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

    @Test
    public void checkValueNegative() {
        assertTrue(Calculator.isNegative(value) == expectedToBeNegative);
    }

}
