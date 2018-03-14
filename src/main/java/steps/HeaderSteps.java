package steps;

import cucumber.api.DataTable;
import models.SearchProductAutoSuggestLine;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pages.Header;

import java.util.ArrayList;
import java.util.List;
@Component
public class HeaderSteps {
    @Autowired
    Header header;
    @Autowired
    public HeaderSteps(){
    }

    public void isCityDisplayedInHeaderMenu(String itemName) {
        if(header.waitForTextToBePresentIn(header.SELECTED_CITY, itemName,5)!=null) {
            Assert.assertEquals(itemName, header.getTextOf(header.SELECTED_CITY));
        }else{
            Assert.assertTrue("Element hasn't been found:TIMEOUT EXCEPTION", false);
        }
    }

    public void isNotificationDisplayed(String message) {
        header.waitForVisibilityOfElementLocatedByXpath(header.NOTIFICATION_SELECTED_CITY, 3);
        Assert.assertEquals(message, header.getTextOf(header.NOTIFICATION_SELECTED_CITY));
    }

    public void isFirstItemOfAutosuggestListEqualTo(DataTable autosuggestLine) {
        SearchProductAutoSuggestLine searchProductAutoSuggestLine=new SearchProductAutoSuggestLine("http://","Телевизор TOSHIBA 49U7750EV","","16999 .-");
        List<SearchProductAutoSuggestLine> autosuggestLines=new ArrayList<>();
        autosuggestLines.add(searchProductAutoSuggestLine);
        try {
            autosuggestLine.diff(DataTable.create(autosuggestLines));
            Assert.assertTrue(true);
        }catch(cucumber.runtime.table.TableDiffException e){
            Assert.assertTrue(e.getMessage(),false);
        }
    }

    public void clickOnButtonOnAutosuggestList(String buttonName) {
        header.clickOnByXpath(header.BUTTON,buttonName);
    }

    public void enterIntoGlobalSearchField(String text) {
        header.enterValueIntoField(header.SEARCH_FIELD,text);
    }

    public void clickOnShowAllButtonOnAutosuggestList() throws InterruptedException {
        header.clickOnShowAllButton();
    }
}
