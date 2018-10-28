package com.epam.mentoringprogramm.steps;

import com.epam.mentoringprogramm.bo.User;
import com.epam.mentoringprogramm.driver.BrowserType;
import com.epam.mentoringprogramm.driver.DriverFactory;
import com.epam.mentoringprogramm.driver.DriverManager;
import com.epam.mentoringprogramm.pages.LoginPage;

import javax.naming.OperationNotSupportedException;

public class LoginSteps {

    public void initBrowser(BrowserType type) {
        DriverManager.setDriver(DriverFactory.createDriver(type));
    }

    public void quitDriver() {
        DriverManager.quitDriver();
    }

    public LoginPage openLoginPage() throws OperationNotSupportedException {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        return loginPage;
    }

    public void login(LoginPage loginPage, User user) {
        loginPage.sendLogin(user.getLogin());
        loginPage.sendPassword(user.getPassword());
        loginPage.submitLogin();
    }

    public boolean isLoginPerfomed() {
        LoginPage loginPage = new LoginPage();
        return loginPage.isLogoutButtonDisplayed();
    }

}
