package pages;

import models.Browser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home extends Header {
    private String URL = "https://eldorado.ua/";
    @Autowired
    private Browser browser;

    public void open() {
        browser.webDriver.navigate().to(URL);
    }

}
