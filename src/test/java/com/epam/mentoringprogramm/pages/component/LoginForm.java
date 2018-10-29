package com.epam.mentoringprogramm.pages.component;

import static com.epam.mentoringprogramm.actions.Actions.moveToElementAndClick;

import com.epam.mentoringprogramm.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LoginForm extends AbstractComponent {

    private Wait<WebDriver> wait = new FluentWait<>(DriverManager.getDriver())
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofSeconds(1));

    @FindBy(id = "mailbox:login")
    private WebElement loginField;

    @FindBy(id = "mailbox:password")
    private WebElement passwordField;

    @FindBy(id = "mailbox:submit")
    private WebElement submitButton;

    public void sendLogin(String login) {
        loginField.sendKeys(login);
    }

    public void sendPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void submitLogin() {
        moveToElementAndClick(submitButton);
    }

    public boolean isDisplayed()
    {
        wait.until(ExpectedConditions.visibilityOf(loginField));
        return loginField.isDisplayed()&&passwordField.isDisplayed()&&submitButton.isDisplayed();
    }
}
