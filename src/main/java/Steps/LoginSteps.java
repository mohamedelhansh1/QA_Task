package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginSteps extends Base {

    LoginPage login = new LoginPage(driver);
    HomePage HP = new HomePage(driver);

// the main function for this class to add our steps
    @Given("the user redirect to login page")
    public void theUserNavigatesToLoginScreen() {
        login.openLoginScreen();
    }


    @When("Submit email using {string} and password using {string}")
    public void submitEmailPassword(String email, String password) throws InterruptedException {
        login.fillEmailData(email);
        login.fillPasswordData(password);

    }
    @When("Click on login button")
    public void clickOnLoginBtn() throws InterruptedException {
        login.clickSignInButton();
    }

    @Then("Success login and redirect to home page")
    public void successLogin() {
        Assert.assertTrue(HP.homePageAfterLoginIsDisplayed());
        HP.getWelcomeMessage();
        HP.getHomeURL();
    }


}
