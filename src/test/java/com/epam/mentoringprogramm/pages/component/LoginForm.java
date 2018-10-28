package com.epam.mentoringprogramm.pages.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends AbstractComponent {

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
        submitButton.click();
    }
}
