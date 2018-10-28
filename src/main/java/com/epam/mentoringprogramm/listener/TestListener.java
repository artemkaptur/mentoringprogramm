package com.epam.mentoringprogramm.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestListener implements IInvokedMethodListener {

    private static Logger logger = LogManager.getLogger();

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        logger.info("Method started: class - " + method.getTestMethod().getRealClass() + ", method - "
                + method.getTestMethod().getMethodName());

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        logger.info("Method finished [" + testResult.getStatus() + "]: class - "
                + method.getTestMethod().getRealClass() + ", method - "
                + method.getTestMethod().getMethodName() + "\n");
    }
}
