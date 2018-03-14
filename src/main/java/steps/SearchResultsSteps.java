package steps;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pages.SearchResultsPage;
@Component
public class SearchResultsSteps {
    @Autowired
    SearchResultsPage searchResultsPage;

    public void isEachProductDescriptionContain(String text) throws InterruptedException {
        Thread.sleep(2000);
        searchResultsPage.getTextValuesOf(searchResultsPage.GOOD_CONTAINER_GOOD_DESCRIPTION)
                .forEach(description-> Assert.assertTrue(description.toLowerCase().contains(text)));
    }
}
