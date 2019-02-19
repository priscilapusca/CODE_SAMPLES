package com.cucumber.selenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;

public class Search {

    private WebDriver webDriver = null;

    @Given("^open wikipedia$")
    public void openWikipedia() {

        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.navigate().to("http://en.wikipedia.org");
    }

    @Given("^enter search term '(.*?)'$")
    public void searchFor(String searchTerm) {

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchField = webDriver.findElement(By.id("searchInput"));
        searchField.sendKeys(searchTerm);
    }

    @When("^do search$")
    public void clickSearchButton() {

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchButton = webDriver.findElement(By.id("searchButton"));
        searchButton.click();
    }

    @Then("^multiple results are shown for '(.*?)'$")
    public void verifyResults(String searchResult) {

        WebElement results = webDriver.findElement(By.cssSelector("div#mw-content-text"));
        assertTrue(results.getText().contains(searchResult));
    }

    @Given("^user clicks on Talk link$")
    public void clickOnTalk() {

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement talkLink = webDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/ul/li[2]/span/a"));
        talkLink.click();
    }

    @When("^enters a question$")
    public void submitQuestion() {

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchField = webDriver.findElement(By.xpath(
                "//*[@id=\"mw-content-text\"]/div/table[2]/tbody/tr/td[2]/div[2]/form/input[1]"));
        searchField.sendKeys("How to submit an article?");
        searchField.submit();

    }

    @Then("multiple results are shown$")
    public void checkResults() throws InterruptedException {

        new WebDriverWait(webDriver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "/html/body/div[3]/div[3]/div[3]/div[2]/form/div[1]/div[2]/strong[2]")));

        WebElement results = webDriver.findElement(By.xpath(
                "/html/body/div[3]/div[3]/div[3]/div[2]/form/div[1]/div[2]/strong[2]"));
        assertTrue(Integer.parseInt(results.getText()) > 1);

    }

}
