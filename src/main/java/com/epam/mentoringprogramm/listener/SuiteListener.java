package com.epam.mentoringprogramm.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

public class SuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.METHODS);
        suite.getXmlSuite().setThreadCount(2);
    }

    @Override
    public void onFinish(ISuite suite) {

    }
    
}
