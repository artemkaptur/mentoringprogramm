package com.epam.mentoringprogramm.actions;

import com.epam.mentoringprogramm.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Actions {

    public static void moveToElementAndClick(WebElement element) {
        new org.openqa.selenium.interactions.Actions(DriverManager.getDriver())
                .moveToElement(element).click().perform();
    }

    public static void clickOnElementUsingJSexecutor(WebElement element)
    {
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", element);
    }

}
