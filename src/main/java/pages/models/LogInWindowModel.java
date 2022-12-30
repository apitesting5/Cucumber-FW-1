package pages.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class LogInWindowModel {
    @FindBy(xpath = "//input[@id='loginEmail']")
    private WebElement mailTextbox;

    @FindBy(xpath = "//input[@id='passwordEmail']")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//form[@id='loginForm']/button[@class='btn btn-primary']")
    private WebElement continueBtn;

    private WebDriver driver;

    public LogInWindowModel(WebDriver driver){
        this.driver = driver;
        initElements(driver, this);
    }

    public void fillEmailandPassword(String email, String password){
        mailTextbox.sendKeys(email);
        passwordTextbox.sendKeys(password);
    }

    public void pressContinueBtn(){
        continueBtn.click();
    }


}
