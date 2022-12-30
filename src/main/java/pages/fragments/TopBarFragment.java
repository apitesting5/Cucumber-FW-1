package pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class TopBarFragment {

    @FindBy(xpath = "//button[@class='btn login-btn']")
    private WebElement loginBtn;

    private WebDriver driver;

    public TopBarFragment(WebDriver driver) {
      this.driver = driver;
      initElements(driver, this);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }


}
