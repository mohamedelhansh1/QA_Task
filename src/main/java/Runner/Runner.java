package Runner;

import Utils.Base;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@CucumberOptions(features = {
      "src/main/resources/features/Login.feature",
}
        , glue = {"Steps"}
        , plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
        , monochrome = true
        , publish = true
)
public class Runner extends Base {

}
