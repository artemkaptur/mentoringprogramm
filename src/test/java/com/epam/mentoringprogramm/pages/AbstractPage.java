package com.epam.mentoringprogramm.pages;

import com.epam.mentoringprogramm.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.naming.OperationNotSupportedException;

public abstract class AbstractPage {

    protected WebDriver driver;

    protected AbstractPage() {
        driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public abstract void openPage() throws OperationNotSupportedException;

}
