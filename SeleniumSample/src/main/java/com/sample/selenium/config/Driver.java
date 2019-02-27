package com.sample.selenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver webDriver = null;

    // initializes the webdriver and create a new instance of chromedriver
    public static void init(){

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    // accesses the driver instance
    public static WebDriver getInstance(){

        return webDriver;
    }

    // closes all the driver related windows opened
    public static void close(){

        webDriver.quit();
    }
}
