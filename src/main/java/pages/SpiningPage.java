package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SpiningPage {
    @FindBy(xpath = "//div[@class='select-box-current']")
    private WebElement selectFilter;

    @FindBy(xpath = "//div[@class='select-box-current']/div[@class='select-box-value']")
    private List<WebElement> filterOptions;

    @FindBy(xpath = "//div[@class='price']")
    private List<WebElement> prices;

    private WebDriver driver;

    public SpiningPage(WebDriver driver){
        this.driver = driver;
        initElements(driver, this);
    }

    public void chooseFilterOption(String option){
        selectFilter.click();

        for(WebElement x : filterOptions){
            System.out.println(x.getText() + "bbb");
            if(x.getText().equals(option)){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
               x.click();
            }
        }
    }

    public ArrayList<Integer> getActualPricesOfProducts(){
        ArrayList<Integer> actualPrices =  new ArrayList<>();

        for(WebElement x : prices){
            actualPrices.add(Integer.parseInt(x.getText().replaceAll("\\s+","").replaceAll("₽", "")));
        }
        return actualPrices;
    }
}
