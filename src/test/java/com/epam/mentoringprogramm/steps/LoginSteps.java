package com.epam.mentoringprogramm.steps;

import com.epam.mentoringprogramm.bo.User;
import com.epam.mentoringprogramm.driver.BrowserType;
import com.epam.mentoringprogramm.driver.DriverFactory;
import com.epam.mentoringprogramm.driver.DriverManager;
import com.epam.mentoringprogramm.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.naming.OperationNotSupportedException;

public class LoginSteps {

    private final Logger logger = LogManager.getLogger();

    public void initBrowser(BrowserType type) {
        DriverManager.setDriver(DriverFactory.createDriver(type));
    }

    public void quitDriver() {
        DriverManager.quitDriver();
    }

    public LoginPage openLoginPage() throws OperationNotSupportedException {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        logger.info("Login page is opened");
        return loginPage;
    }

    public void login(LoginPage loginPage, User user) {
        loginPage.getLoginForm().sendLogin(user.getLogin());
        loginPage.getLoginForm().sendPassword(user.getPassword());
        loginPage.getLoginForm().submitLogin();
        logger.info("Login is perfomed");
    }

    public LoginPage logout() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnLogoutButton();
        logger.info("Logout is perfomed");
        return loginPage;
    }

    public boolean isLoginPerfomed() {
        LoginPage loginPage = new LoginPage();
        return loginPage.isLogoutButtonDisplayed();
    }

    public boolean isLogoutPerfomed(LoginPage loginPage) {
        return loginPage.isLoginFormDisplayed();
    }

    public boolean isLogedAsUser(User testUser) {
        LoginPage loginPage = new LoginPage();
        return testUser.getLogin().equals(loginPage.getLogedUserEmail());
    }
}
