package pages;

import org.openqa.selenium.WebDriver;
import pages.fragments.TopBarFragment;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainPage {

    private TopBarFragment topBarFragment;
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
        initElements(driver, this);
        topBarFragment = new TopBarFragment(driver);
    }

    public void logIn() {
        topBarFragment.clickLoginBtn();

    }


}
