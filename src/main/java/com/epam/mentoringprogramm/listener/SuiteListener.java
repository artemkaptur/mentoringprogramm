package com.epam.mentoringprogramm.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

import java.util.stream.Collectors;

public class SuiteListener implements ISuiteListener {

    private static Logger logger = LogManager.getLogger();

    @Override
    public void onStart(ISuite suite) {
        suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.METHODS);
        suite.getXmlSuite().setThreadCount(2);

        logger.info("Suite started: " + suite.getXmlSuite().getFileName());
    }

    @Override
    public void onFinish(ISuite suite) {
        StringBuilder eachMethodDuration = new StringBuilder();

        for (IInvokedMethod method : suite.getAllInvokedMethods()) {
            eachMethodDuration.append(method.getTestMethod().getMethodName())
                    .append(" duration ")
                    .append(method.getTestResult().getEndMillis() - method.getTestResult().getStartMillis())
                    .append(" milis\n");
        }

        logger.info("Suite finished: " + suite.getXmlSuite().getFileName() + "\n" + eachMethodDuration.toString());
    }
}
