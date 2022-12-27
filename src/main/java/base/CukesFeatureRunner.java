package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.CucumberOptions;

import static base.ChromeDriveOptions.getOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/Authorization.feature"},
        glue = {"steps"}
)
public class CukesFeatureRunner {

    public static WebDriver driver;

    @Before
    public void beforeClass() {
        driver = new ChromeDriver(getOptions());
    }

    @After
    public void afterClass() {
        driver.quit();
    }
}
