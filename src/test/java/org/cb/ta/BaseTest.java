package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import java.io.InterruptedIOException;

public abstract class BaseTest {
    protected final WebDriver driver;


    public BaseTest() {
        this.driver = Driver.getDriver();
    }

    @AfterClass
    public void teardown() throws InterruptedIOException {
        driver.quit();
    }
}
