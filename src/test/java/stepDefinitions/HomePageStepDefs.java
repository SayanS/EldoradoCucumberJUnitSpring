package stepDefinitions;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import steps.HeaderSteps;
import steps.HomePageSteps;
import utils.GenerateUniqueEmail;

import java.util.List;
@ContextConfiguration(locations = {"/spring.xml"})
public class HomePageStepDefs {
    @Autowired
    private HeaderSteps headerSteps;
    @Autowired
    public HomePageSteps homePageSteps;

    @Given("^Home page is opened$")
    public void homePageIsOpened() throws Throwable {
        homePageSteps.open();
    }

    @Given("^User credentials$")
    public void userCredentialsAnd(List<User> user) {
        homePageSteps.printUserCredentials(user.get(0));
    }

    @Then("^Change user \"([^\"]*)\" to unique value$")
    public void changeUserToUniqueValue(@Transform(GenerateUniqueEmail.class) String email) {
        System.out.println(email);
    }
}
