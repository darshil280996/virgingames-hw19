package virgingames.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import virgingames.pages.HomePage;
import virgingames.pages.LoginPage;

public class LoginSteps {
    @Given("I am on homepage and verify the homepage URL")
    public void iAmOnHomepageAndVerifyTheHomepageURL() {
        new HomePage().verifyHomePage();
    }

    @And("I accept all cookies in homepage")
    public void iAcceptAllCookiesInHomepage() {
        new HomePage().clickOnAcceptAllCookies();
    }

    @When("I click on Login Link")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("I enter {string} Invalid Username and {string} Invalid Password for login")
    public void iEnterInvalidUsernameAndInvalidPasswordForLogin(String username, String password) {
        new LoginPage().sendDataToLoginFields(username , password);
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String message) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),"Please try again, your username/email or password has not been recognised");

    }


}
