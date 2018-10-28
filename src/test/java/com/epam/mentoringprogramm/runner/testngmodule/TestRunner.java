package com.epam.mentoringprogramm.runner.testngmodule;

import com.epam.mentoringprogramm.listener.SuiteListener;
import com.epam.mentoringprogramm.listener.TestListener;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();

        tng.addListener((ITestNGListener) new TestListenerAdapter());
        tng.addListener((ITestNGListener) new SuiteListener());
        tng.addListener((ITestNGListener) new TestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("CalculatorTestsSuite");

        List<String> files = new ArrayList<>(new ArrayList<String>() {{
            add("./src/test/resources/suites/suite-with-parameter.xml");
            add("./src/test/resources/suites/suite-by-groups.xml");
            add("./src/test/resources/suites/rest-tests-suite.xml");
        }});
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
