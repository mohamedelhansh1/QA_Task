package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Utils.Base.driver;

public class logoutSteps {
    HomePage HP = new HomePage(driver);
    LoginPage login =new LoginPage(driver);

    @When("the user clicks on the logout button")
    public void clickOnLogoutBtn() {
        HP.clickOnProfileIcon();
        HP.clickOnLogoutBtn();
    }

    @When("the user logout and redirect to login page")
    public void navigateToSignPage() throws InterruptedException {
        Assert.assertTrue(login.loginPageAfterLogout());
        login.getPageTitle();

    }
}
