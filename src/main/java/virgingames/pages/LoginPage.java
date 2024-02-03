package virgingames.pages;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import virgingames.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement clickOnLogin;

    @CacheLookup
    @FindBy(name = "username")
    WebElement loginUserNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement loginPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button button-login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='output']")
    WebElement errorMessage;

    public void clickOnLoginLink() {
        clickOnElement(clickOnLogin);
        log.info("Clicking on LoginLink " + clickOnLogin.toString());
    }

    public void sendDataToLoginFields(String userName, String password) {
        sendTextToElement(loginUserNameField, userName);
        log.info("Sending data to Email Address Field in Login : " + loginUserNameField.toString());
        sendTextToElement(loginPasswordField, password);
        log.info("Sending data to Password Field in Login : " + loginPasswordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login Button on Login Page " + loginButton.toString());
    }

    public String getErrorMessage() {
        log.info("Getting Error message text " + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }

}
