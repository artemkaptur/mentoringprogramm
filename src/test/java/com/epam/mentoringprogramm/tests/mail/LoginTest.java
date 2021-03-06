package com.epam.mentoringprogramm.tests.mail;

import com.epam.mentoringprogramm.bo.User;
import com.epam.mentoringprogramm.driver.BrowserType;
import com.epam.mentoringprogramm.steps.LoginSteps;
import org.testng.annotations.Test;

import javax.naming.OperationNotSupportedException;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    private final static User TEST_USER = new User("etestuser3@mail.ru", "qwerty123456");

    public LoginTest(BrowserType type) {
        super(type);
    }

    @Test
    public void loginTest() throws OperationNotSupportedException {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(loginSteps.openLoginPage(), TEST_USER);
        assertTrue(loginSteps.isLoginPerfomed());
        assertTrue(loginSteps.isLogedAsUser(TEST_USER));
    }

}
