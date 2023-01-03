package base;

import io.cucumber.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.CucumberOptions;

import java.util.concurrent.TimeUnit;

import static settings.ChromeDriveOptions.getOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"}
)
public class CukesFeatureRunner {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = new ChromeDriver(getOptions());
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }
}
