package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MainPage;
import pages.SpiningPage;

import java.util.ArrayList;
import java.util.Collections;

import static base.CukesFeatureRunner.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FilteringSteps {


    @Then("I go to Спининги section")
    public void iGoToXxxSection() {
        new MainPage(driver).goToSpinningsPage();
    }

    @And("^I choose filter option (.*)$")
    public void iChooseFilterOptionXxx(String option) {
        new SpiningPage(driver).chooseFilterOption(option);
    }

    @Then("I should see decreasing prices of products")
    public void iShouldSeeDecreasingPricesOfProducts() {
        ArrayList<Integer> actualPrices = new SpiningPage(driver).getActualPricesOfProducts();
        ArrayList<Integer> expectedPrices = new ArrayList<>(actualPrices);
        Collections.sort(expectedPrices, Collections.reverseOrder());

        assertThat("Problems with filters", actualPrices, equalTo(expectedPrices));

    }
}
