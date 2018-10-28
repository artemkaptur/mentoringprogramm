package com.epam.mentoringprogramm.pages;

import static com.epam.mentoringprogramm.actions.Actions.clickOnElementUsingJSexecutor;

import com.epam.mentoringprogramm.driver.DriverManager;
import com.epam.mentoringprogramm.pages.component.LoginForm;
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

    private LoginForm loginForm;

    @FindBy(id = "PH_logoutLink")
    private WebElement logoutButton;

    public LoginPage() {
        super();
        loginForm = new LoginForm();
    }

    @Override
    public void openPage() throws OperationNotSupportedException {
        driver.navigate().to(BASE_URL);
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public void clickOnLogoutButton()
    {
        clickOnElementUsingJSexecutor(logoutButton);
    }

    public boolean isLogoutButtonDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(logoutButton)).isDisplayed();
    }

    public boolean isLoginFormDisplayed() {
        return getLoginForm().isDisplayed();
    }
}
