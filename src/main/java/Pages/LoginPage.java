package Pages;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    String url = "https://oyn-adminportal-qc-demo.salmonsky-1edff179.westeurope.azurecontainerapps.io/identity/login";

    By emailField = By.id("mat-input-0");
    By passwordField = By.id("mat-input-1");
    By signInButton = By.xpath("/html/body/app-root/anonymous-layout/section/div[2]/div[2]/login/div/div[3]/loader-button");
    By signInText = By.xpath( "/html/body/app-root/anonymous-layout/section/div[2]/div[2]/login/div/div[1]/page-header/section/div[1]/h3");
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginScreen() {
        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }


    public void fillEmailData(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillPasswordData(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignInButton() throws InterruptedException {
        driver.findElement(signInButton).click();

    }
    public boolean loginPageAfterLogout() {
        driver.findElement(signInText).isDisplayed();
        return true;
    }
    public void getPageTitle() throws InterruptedException {
        String text =driver.findElement(signInText).getText();
        System.out.println("Hello You are on the :"+text+"Page");

    }


}
