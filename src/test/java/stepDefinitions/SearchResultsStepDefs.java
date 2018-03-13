package stepDefinitions;

import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import steps.HeaderSteps;
import steps.HomePageSteps;
import steps.SearchResultsSteps;
import steps.SelectCityPopUpSteps;
@ContextConfiguration(locations = {"/spring.xml"})

public class SearchResultsStepDefs {
    @Autowired
    private HeaderSteps headerSteps;
    @Autowired
    private HomePageSteps homePageSteps;
    @Autowired
    private SelectCityPopUpSteps selectCityPopUpSteps;
    @Autowired
    private SearchResultsSteps searchResultsSteps;

    @Then("^All descriptions of the products in Search results should contain \"([^\"]*)\"$")
    public void allDescriptionsOfTheProductsInSearchResultsShouldContain(String text) throws InterruptedException {
        searchResultsSteps.isEachProductDescriptionContain(text);
    }
}
