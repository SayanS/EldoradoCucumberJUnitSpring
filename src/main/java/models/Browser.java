package models;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Browser {
    public WebDriver webDriver;
    @Autowired
    public Browser(){
    }
}
