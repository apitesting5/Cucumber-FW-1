package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

import static base.CukesFeatureRunner.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LogInSteps  {

    @When("I press log in button")
    public void iPressLogInButton() { new MainPage(driver).presslogInBtn(); }

    @And("^I fill (.*) and (.*)")
    public void iFillXxxAndXxx(String email, String password) {
        new MainPage(driver).fillEmailandPass(email, password);
    }

    @And("I press authorization button")
    public void iPressAuthorizationButton() {
        new MainPage(driver).pressAutorizeBtn();
    }

    @Then("^I should see (.*) and user is authorized$")
    public void iShouldSeeXxxAndUserIsAuthorized(String acc) {
        assertThat(new MainPage(driver).getPercCabinetStr(), equalTo(acc));
    }

    @Then("^I should see alert (.*)$")
    public void iShouldSeeAlertXxx(String alert) {
        assertThat(new MainPage(driver).getAlertErrorStr(), equalTo(alert));
    }
}
