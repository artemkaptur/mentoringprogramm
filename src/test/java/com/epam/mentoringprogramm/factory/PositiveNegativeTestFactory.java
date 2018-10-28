package com.epam.mentoringprogramm.factory;

import com.epam.mentoringprogramm.tests.calculator.PositiveNegativeTest;
import org.testng.annotations.Factory;

public class PositiveNegativeTestFactory {

    @Factory
    public Object[] generatePositiveNegativeTests() {
        return new Object[]
                {
                        new PositiveNegativeTest(1, true, false),
                        new PositiveNegativeTest(-1, false, true)
                };
    }

}
