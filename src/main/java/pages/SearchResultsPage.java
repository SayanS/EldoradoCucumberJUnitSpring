package pages;

import models.Browser;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchResultsPage extends BasePage{
    @Autowired
    private Browser browser;
    private WebDriver webDriver;
    @Autowired
    public SearchResultsPage(){}
//    public SearchResultsPage(Browser browser){
//        super(browser);
//        this.browser=browser;
//        this.webDriver=browser.webDriver;
//    }
    public final String GOOD_CONTAINER=".//div[@class='goods-item-content']";
    public final String GOOD_CONTAINER_GOOD_CODE=".//div[@class='goods-code gilroyed']/span";
    public final String GOOD_CONTAINER_GOOD_DESCRIPTION=".//div[@class='good-description']//a";


}
