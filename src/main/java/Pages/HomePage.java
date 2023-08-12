package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // declare welcome message, Profile icon , logout button
    By welcomeMessage = By.xpath("/html/body/app-root/admin-layout/section/div[3]/dashboard/p");
    By profileIcon = By.xpath("/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]");
    By logoutBtn = By.xpath("/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]/ul/li[3]");

    private WebDriver driver;


    // By dropdown = By.xpath("//user/dropdown[contains(text(), 'Logout')]");
    // creating constructor for driver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // function to get the welcome message and printing it
    public void getWelcomeMessage() {

        String text = driver.findElement(welcomeMessage).getText();
        System.out.println("Welcome Message :" + text);
    }

    // function to get the URL for page and printing it
    public void getHomeURL() {
        String URL = driver.getCurrentUrl();
        System.out.println("URL :" + URL);
    }

    // function to assert the login page is fully loaded
    public boolean homePageAfterLoginIsDisplayed() {
        driver.findElement(welcomeMessage).isDisplayed();
        return true;
    }
    // function to click on the profile icon
    public void clickOnProfileIcon() {

        driver.findElement(profileIcon).click();
    }

    // function to click on the logout button
    public void clickOnLogoutBtn() {
        driver.findElement(logoutBtn).click();


    }
}
