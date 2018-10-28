package com.epam.mentoringprogramm.tests.mail;

import com.epam.mentoringprogramm.driver.BrowserType;
import com.epam.mentoringprogramm.steps.LoginSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private LoginSteps loginSteps = new LoginSteps();

    private BrowserType type;

    protected BaseTest(BrowserType type) {
        this.type = type;
    }

    @BeforeMethod()
    public void setUpBrowser() {
        loginSteps.initBrowser(type);
    }

    @AfterMethod()
    public void stopBrowser() {
        loginSteps.quitDriver();
    }
}
