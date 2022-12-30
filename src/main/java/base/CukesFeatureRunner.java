package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.CucumberOptions;

import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void afterClass() {
        driver.close();
        driver.quit();
    }
}
