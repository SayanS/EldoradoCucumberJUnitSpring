package pages;

import org.springframework.stereotype.Component;

@Component
public class SearchResultsPage extends BasePage{

    public final String GOOD_CONTAINER=".//div[@class='goods-item-content']";
    public final String GOOD_CONTAINER_GOOD_CODE=".//div[@class='goods-code gilroyed']/span";
    public final String GOOD_CONTAINER_GOOD_DESCRIPTION=".//div[@class='good-description']//a";


}
