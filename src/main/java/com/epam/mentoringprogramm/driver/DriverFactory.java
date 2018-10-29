package com.epam.mentoringprogramm.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final Logger logger = LogManager.getLogger();

    public static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROMDRIVER_EXE_PATH  = "src/main/resources/webdrivers/mac/chromedriver";
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";
    private static final String WEBDRIVER_GECKODRIVER_EXE_PATH = "src/main/resources/webdrivers/mac/geckodriver";


    public static WebDriver createDriver(BrowserType type) {
        WebDriver driver;
        switch (type) {
            case CHROME:
                driver = createChromeDriver();
                break;
            case FIREFOX:
                driver = createFirefoxDriver();
                break;
            default:
                driver = createChromeDriver();
                break;
        }

        driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        logger.info(type + " browser started");
        return driver;
    }

    private static ChromeDriver createChromeDriver() {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, WEBDRIVER_CHROMDRIVER_EXE_PATH);
        return new ChromeDriver();
    }

    private static FirefoxDriver createFirefoxDriver() {
        System.setProperty(WEBDRIVER_GECKO_DRIVER, WEBDRIVER_GECKODRIVER_EXE_PATH);
        return new FirefoxDriver();
    }

}
