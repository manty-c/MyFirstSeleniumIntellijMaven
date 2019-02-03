package com.mytest.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\manto\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.seleniumsimplified.com/");
        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.quit();


    }
}
