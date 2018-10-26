package com.epam.mentoringprogramm.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

public class SuiteListener implements ISuiteListener {

    private static Logger logger = LogManager.getLogger();

    @Override
    public void onStart(ISuite suite) {
        suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.METHODS);
        suite.getXmlSuite().setThreadCount(2);

        logger.info("suite started: " + suite.getXmlSuite().getFileName());
    }

    @Override
    public void onFinish(ISuite suite) {
        logger.info("suite finished: " + suite.getXmlSuite().getFileName());
    }

}
