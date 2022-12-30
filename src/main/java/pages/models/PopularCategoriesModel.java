package pages.models;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.PageFactory.initElements;

public class PopularCategoriesModel {
    @FindBy(xpath = "//div[@id='popularCategoriesSlider']/a[contains(@href, 'spinning')]")
    private WebElement spiningsSection;

    @FindBy(xpath = "")
    private WebElement reelsSection;

    @FindBy(xpath = "")
    private WebElement rodsBolognSection;

    @FindBy(xpath = "")
    private WebElement rodsFidSection;

    @FindBy(xpath = "")
    private WebElement braidCordSection;

    private WebDriver driver;

    public PopularCategoriesModel(WebDriver driver){
        this.driver = driver;
        initElements(driver, this);
    }

    public void goToSpinningSection(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,470)", "");
        spiningsSection.click();
    }
}
