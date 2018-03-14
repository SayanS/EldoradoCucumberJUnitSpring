package pages;

import org.springframework.stereotype.Component;

@Component
public class Home extends Header {
    private String URL = "https://eldorado.ua/";

    public void open() {
        getWebDriver().navigate().to(URL);
    }

}
