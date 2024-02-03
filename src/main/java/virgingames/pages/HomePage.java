package virgingames.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import virgingames.propertyreader.PropertyReader;
import virgingames.utility.Utility;

import static virgingames.browserfactory.ManageBrowser.driver;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//label[@class='dialog_button'])[2]")
    WebElement acceptAllCookies;


    public void verifyHomePage() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("Verifying Homepage Url");
        Assert.assertEquals(actualUrl, expectedUrl, "Home Page Url");
    }

    public void clickOnAcceptAllCookies() {
        clickOnElement(acceptAllCookies);
      log.info("Click on accept All Cookies" + acceptAllCookies.toString());
    }
}
