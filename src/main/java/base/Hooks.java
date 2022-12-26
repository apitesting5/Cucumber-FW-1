package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.LogInSteps;

import static base.ChromeDriveOptions.getOptions;

public class Hooks {

    protected static WebDriver driver;

    @Before
    public void beforeClass() {
        driver = new ChromeDriver(getOptions());
    }

    @After
    public void afterClass() {
        driver.quit();
    }
}
