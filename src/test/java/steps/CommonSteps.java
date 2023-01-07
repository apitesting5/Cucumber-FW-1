package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.MainPage;

import static base.CukesFeatureRunner.driver;

public class CommonSteps {
    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("https://foxfishing.ru/");
    }

    @And("I log in with valid user")
    public void iLogInWithValidUser() {
        String email = "ferenousacalifor@gmail.com";
        String pass = "Lipton111";

    }

}
