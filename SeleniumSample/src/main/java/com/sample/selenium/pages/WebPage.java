package com.sample.selenium.pages;

import com.sample.selenium.config.DriverFunctions;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebPage {

    private static final By SEARCH_FIELD_LOCATOR = By.cssSelector(".gLFyf.gsfi");
    private static final By FIRST_PAGE_LINK_LOCATOR = By.cssSelector(".LC20lb");
    private static final By GOOGLE_SEARCH_BUTTON_LOCATOR = By.xpath(
            "//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");

    // navigates to a specific url by calling the driver method
    public static void goTo(String url){

        DriverFunctions.navigate(url);
    }

    // gets the title of the current window by calling the driver method
    public static String getTitle(){

        return DriverFunctions.getTitle();
    }

    // types in a certain text and submits it
    public static void searchOnGoogle(String inputText){

        DriverFunctions.type(inputText, SEARCH_FIELD_LOCATOR);
        DriverFunctions.submit(SEARCH_FIELD_LOCATOR);
    }

    // returns the first link text found on google after search of a word
    public static String getFirstLinkTextOnGooglePage(){

        WebElement firstLink = DriverFunctions.find(FIRST_PAGE_LINK_LOCATOR);
        if(firstLink != null){
            return firstLink.getText();
        }

        return StringUtils.EMPTY;
    }

    // calls the driver method to switch to another frame
    public static void switchToAnotherFrame(String name){

        DriverFunctions.switchFrame(name);
    }

    // calls the driver method to click a link found by partial link name
    public static void clickLink(String partialLinkText){

        DriverFunctions.click(By.partialLinkText(partialLinkText));
    }

    // calls the driver method for clicking a button found by css selector
    public static void clickGoButton(){

        DriverFunctions.click(By.cssSelector("input[value=\"Go!\"]"));
    }

    // calls the driver method to switch to the alert displayed on page
    public static String switchToPageAlertAndGetText(){

        return DriverFunctions.switchToAlert();
    }

    public static boolean checkGoogleSearchButtonElementIsDisplayed(){

        return DriverFunctions.isDisplayed(GOOGLE_SEARCH_BUTTON_LOCATOR);
    }
}
