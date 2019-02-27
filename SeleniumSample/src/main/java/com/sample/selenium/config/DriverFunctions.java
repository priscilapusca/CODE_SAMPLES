package com.sample.selenium.config;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class DriverFunctions {

    // navigates to desired url
    public static void navigate(String url){

        Driver.getInstance().navigate().to(url);
    }

    // checks if a element is displayed on page
    public static boolean isDisplayed(By locator){

        WebElement locatedElement = find(locator);
        if(locatedElement != null){
            return locatedElement.isDisplayed();
        }

        return false;
    }

    // types in a element field found by a locator the desired text
    public static void type(String inputText, By locator){

        WebElement locatedElement = find(locator);
        if(locatedElement != null){
            locatedElement.sendKeys(inputText);
        }
    }

    // click an element found by a locator
    public static void click(By locator){

        WebElement locatedElement = find(locator);
        if(locatedElement != null){
            locatedElement.click();
        }
    }

    // submits a text
    public static void submit(By locator){

        WebElement locatedElement = find(locator);
        if(locatedElement != null){
            locatedElement.submit();
        }
    }

    // gets the title of the current driver window
    public static String getTitle(){

        return Driver.getInstance().getTitle();
    }

    // switches to another frame found by its name
    public static void switchFrame(String name){

        Driver.getInstance().switchTo().frame(name);
    }

    // switches to an alert and gets the text displayed by it
    public static String switchToAlert(){

        return Driver.getInstance().switchTo().alert().getText();
    }

    // finds and element by a locator
    public static WebElement find(By locator){

        try {
            return Driver.getInstance().findElement(locator);
        }catch (NoSuchElementException exception){
            return null;
        }
    }
}
