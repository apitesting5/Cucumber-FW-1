package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.fragments.TopBarFragment;
import pages.models.LogInWindowModel;
import pages.models.PopularCategoriesModel;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainPage {
    @FindBy(xpath = "//a[@class='btn login-btn']/span[text()='Личный кабинет']")
    private WebElement personalCabinetSpan;

    @FindBy(xpath = "//label[@id='loginEmail-error']")
    private WebElement alertIncorrectCredentials;

    private TopBarFragment topBarFragment;
    private LogInWindowModel logInWindowModel;
    private PopularCategoriesModel popularCategoriesModel;
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
        initElements(driver, this);
        topBarFragment = new TopBarFragment(driver);
        logInWindowModel = new LogInWindowModel(driver);
        popularCategoriesModel = new PopularCategoriesModel(driver);
    }

    public void presslogInBtn() { topBarFragment.clickLoginBtn(); }

    public void fillEmailandPass(String email, String password) {
        logInWindowModel.fillEmailandPassword(email, password);
    }

    public void pressAutorizeBtn() {
        logInWindowModel.pressContinueBtn();
    }

    public void logInWithValidUser(String email, String password) {
        topBarFragment.clickLoginBtn();
        logInWindowModel.fillEmailandPassword(email, password);
        logInWindowModel.pressContinueBtn();
    }

    public void goToSpinningsPage(){
        popularCategoriesModel.goToSpinningSection();

    }
    public String getPercCabinetStr() { return personalCabinetSpan.getText();
    }

    public String getAlertErrorStr() {
        return alertIncorrectCredentials.getText();
    }

}
