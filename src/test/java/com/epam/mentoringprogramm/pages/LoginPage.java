package com.epam.mentoringprogramm.pages;

import com.epam.mentoringprogramm.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.naming.OperationNotSupportedException;
import java.time.Duration;

public class LoginPage extends AbstractPage {

    private final static String BASE_URL = "https://mail.ru/";

    private Wait<WebDriver> wait = new FluentWait<>(DriverManager.getDriver())
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(1));

    @FindBy(id = "mailbox:login")
    private WebElement loginField;

    @FindBy(id = "mailbox:password")
    private WebElement passwordField;

    @FindBy(id = "mailbox:submit")
    private WebElement submitButton;

    @FindBy(id = "PH_logoutLink")
    private WebElement logoutButton;

    public LoginPage() {
        super();
    }

    @Override
    public void openPage() throws OperationNotSupportedException {
        driver.navigate().to(BASE_URL);
    }

    public void sendLogin(String login) {
        loginField.sendKeys(login);
    }

    public void sendPassword(String psw) {
        passwordField.sendKeys(psw);
    }

    public void submitLogin() {
        submitButton.click();
    }

    public boolean isLogoutButtonDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(logoutButton)).isDisplayed();
    }

}
