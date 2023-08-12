package Runner;

import Utils.Base;
import io.cucumber.testng.CucumberOptions;

//here the class to run all scenarios by adding:
// 1- feature file
// 2- steps directory
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
