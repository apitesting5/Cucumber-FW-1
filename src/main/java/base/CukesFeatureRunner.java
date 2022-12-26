package base;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
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


}
