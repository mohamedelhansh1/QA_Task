package Pages;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
            // url for the login page
    String url = "https://oyn-adminportal-qc-demo.salmonsky-1edff179.westeurope.azurecontainerapps.io/identity/login";
  // declaring elements email and password fields , sign in button
    By emailField = By.id("mat-input-0");
    By passwordField = By.id("mat-input-1");
    By signInButton = By.xpath("/html/body/app-root/anonymous-layout/section/div[2]/div[2]/login/div/div[3]/loader-button");
    By signInText = By.xpath( "/html/body/app-root/anonymous-layout/section/div[2]/div[2]/login/div/div[1]/page-header/section/div[1]/h3");
    private WebDriver driver;
    private WebDriverWait wait;

    // creating constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // function to navigate the user to login page the scrolling
    public void openLoginScreen() {
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

// function to send email
    public void fillEmailData(String email) {

        driver.findElement(emailField).sendKeys(email);
    }
// function to send password
    public void fillPasswordData(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

// function to click on the login button
    public void clickSignInButton() throws InterruptedException {
        driver.findElement(signInButton).click();

    }
    // function to assert the user is logged out
    public boolean loginPageAfterLogout() {
        driver.findElement(signInText).isDisplayed();
        return true;
    }
//    function to get the login text and print it

    public void getPageTitle() throws InterruptedException {
        String text =driver.findElement(signInText).getText();
        System.out.println("Hello You are on the :"+text+"Page");

    }


}
