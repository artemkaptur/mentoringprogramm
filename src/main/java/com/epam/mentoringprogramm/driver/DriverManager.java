package com.epam.mentoringprogramm.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            webDriver.remove();
        }
    }

}
