package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

import static base.CukesFeatureRunner.driver;

public class LogInSteps  {

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("https://foxfishing.ru/");
    }

    @When("I press log in button")
    public void iPressLogInButton() {
        new MainPage(driver).logIn();
    }

    @And("I fill username and password")
    public void iFillUsernameAndPassword() throws InterruptedException {
        Thread.sleep(3000);
    }

    @And("I press authorization button")
    public void iPressAuthorizationButton() {
    }

    @Then("User is successfully authorizated")
    public void userIsSuccessfullyAuthorizated() {
    }
}
