package com.sample.selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {

    public static void main(String[] args) {

        // initialize the webdriver
        WebDriverManager.chromedriver().setup();

        // create a new ChromeDriver
        WebDriver webDriver = new ChromeDriver();

        // go to google main page
        webDriver.navigate().to("http://www.google.com");

        // find input search element
        WebElement searchField = webDriver.findElement(By.cssSelector(".gLFyf.gsfi"));

        // type in the search field the text you want to search
        searchField.sendKeys("wikipedia");

        // submit the search text
        searchField.submit();

        // search for first link displayed after search
        WebElement firstLinkDisplayed = webDriver.findElement(By.cssSelector(".LC20lb"));

        // check if the first link found contains the word searched for
        if(firstLinkDisplayed.getText().contains("Wikipedia")){
            System.out.println("Test succeeded");
        }else{
            System.out.println("Test failed");
        }

        webDriver.close();

    }
}
