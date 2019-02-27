import com.sample.selenium.config.Driver;
import com.sample.selenium.pages.WebPage;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebPageTest {

    private static final String PAGE_TITLE = "Welcome: Mercury Tours";
    private static final String PAGE1_URL = "http://demo.guru99.com/test/newtours/";
    private static final String PAGE2_URL = "http:www.google.com";
    private static final String PAGE3_URL = "http://demo.guru99.com/selenium/deprecated.html";
    private static final String PAGE4_URL = "http://jsbin.com/usidix/1";

    @BeforeAll
    static void init(){

        Driver.init();
        Driver.getInstance();
    }

    // goes to a web page and checks for its title
    @Test
    void checkTitle(){

        WebPage.goTo(PAGE1_URL);
        String actualTitle = WebPage.getTitle();
        assertEquals(actualTitle, PAGE_TITLE);
    }

    // search on google a word and checks the first link text displayed
    @Test
    void searchAndCheckResults(){

        WebPage.goTo(PAGE2_URL);
        WebPage.searchOnGoogle("wikipedia");
        String linkText = WebPage.getFirstLinkTextOnGooglePage();

        assertThat(linkText, CoreMatchers.containsString("Wikipedia"));
    }

    // switches to a link after changing the frame
    @Test
    void switchFrameAndClick(){

        WebPage.goTo(PAGE3_URL);
        WebPage.switchToAnotherFrame("classFrame");
        WebPage.clickLink("Deprecated");

    }

    // checks the message displayed by an alert
    @Test
    void checkAlertMessage(){

        WebPage.goTo(PAGE4_URL);
        WebPage.clickGoButton();
        String messageAlert = WebPage.switchToPageAlertAndGetText();

        assertEquals("This is an alert box.", messageAlert);

    }

    // checks a specific element is displayed
    @Test
    void checkElementIsDisplayed(){

        WebPage.goTo(PAGE2_URL);
        boolean isDisplayed = WebPage.checkGoogleSearchButtonElementIsDisplayed();

        assertTrue(isDisplayed);

    }

    @AfterAll
    static void cleanup(){

        Driver.close();
    }

}
