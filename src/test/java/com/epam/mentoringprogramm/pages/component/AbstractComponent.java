package com.epam.mentoringprogramm.pages.component;

import com.epam.mentoringprogramm.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponent {

    protected WebDriver driver;

    protected AbstractComponent() {
        driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

}
