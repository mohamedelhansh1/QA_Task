package Pages;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    By welcomeMessage = By.xpath("/html/body/app-root/admin-layout/section/div[3]/dashboard/p");
    By profileIcon = By.xpath("/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]");
    By logoutBtn = By.xpath("/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]/ul/li[3]");
    private WebDriver driver;
    private WebDriverWait wait;


   // By dropdown = By.xpath("//user/dropdown[contains(text(), 'Logout')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getWelcomeMessage() {

        String text = driver.findElement(welcomeMessage).getText();
        System.out.println("Welcome Message :" + text);
    }

    public void getHomeURL() {
        String URL = driver.getCurrentUrl();
        System.out.println("URL :" + URL);
    }

    public boolean homePageAfterLoginIsDisplayed() {
        driver.findElement(welcomeMessage).isDisplayed();
        return true;
    }
    public void clickOnProfileIcon() {
       driver.findElement(profileIcon).click();
    }

    public void clickOnLogoutBtn() {
        driver.findElement(logoutBtn).click();


    }
}
