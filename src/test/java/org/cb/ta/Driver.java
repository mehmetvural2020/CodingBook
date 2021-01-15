package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public abstract class Driver {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome", "webdriver/chromedriver");

        return new ChromeDriver();
    }

}
