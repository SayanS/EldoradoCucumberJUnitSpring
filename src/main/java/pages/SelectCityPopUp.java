package pages;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SelectCityPopUp extends BasePage {

    public String YES_NO_CONFIRM_CITY_BUTTONS = ".//div[@class='select-city-li']//*[contains(@class,'button') and .='$KeyWord']";
    public String INPUT_CITY = ".//div[@class='city-select']//input[@class='react-autosuggest__input']";
    public String CONTEXT_CITIES = ".//ul[@class='city-select-content row']/li/div";
    public String CITY_LINK=".//ul[@class='city-select-content row']/li/div[.='$KeyWord']";

    public List<String> getListOfContextCities() {
      return getTextValuesOf(CONTEXT_CITIES);
    }


}
