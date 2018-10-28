package com.epam.mentoringprogramm.runner.seleniummodule;

import com.epam.mentoringprogramm.driver.BrowserType;
import com.epam.mentoringprogramm.tests.mail.LoginTest;
import com.epam.mentoringprogramm.tests.mail.LogoutTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class TestFactory {

    @Factory(dataProvider = "browserTypes")
    public Object[] createTests(BrowserType type) {
        return new Object[]{
                new LoginTest(type),
                new LogoutTest(type)
        };
    }

    @DataProvider(name = "browserTypes")
    public Object[][] browserTypes() {
        return new Object[][]{
                {BrowserType.CHROME},
                {BrowserType.FIREFOX}
        };
    }

}
