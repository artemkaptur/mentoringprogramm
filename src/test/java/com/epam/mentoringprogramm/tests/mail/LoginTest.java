package com.epam.mentoringprogramm.tests.mail;

import com.epam.mentoringprogramm.bo.User;
import com.epam.mentoringprogramm.driver.BrowserType;
import com.epam.mentoringprogramm.steps.LoginSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.naming.OperationNotSupportedException;

import static org.testng.Assert.assertTrue;

public class LoginTest {

    private final static User TEST_USER = new User("etestuser3@mail.ru", "qwerty123456");

    private LoginSteps loginSteps = new LoginSteps();

    private BrowserType type;

    public LoginTest(BrowserType type) {
        this.type = type;
    }

    @BeforeClass()
    public void setUpBrowser() {
        loginSteps.initBrowser(type);
    }

    @Test
    public void loginTest() throws OperationNotSupportedException {
        loginSteps.login(loginSteps.openLoginPage(), TEST_USER);
        assertTrue(loginSteps.isLoginPerfomed());
    }

    @AfterClass()
    public void stopBrowser() {
        loginSteps.quitDriver();
    }

}
