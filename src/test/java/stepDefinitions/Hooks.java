package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import models.Browser;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.util.HashMap;

public class Hooks {
    @Autowired
    private Browser browser;

    @Before
    public void setUp(Scenario scenario){
        String pathToFile="/home/user/IdeaProjects/eldoradoBdd/src/test/resources/downloads";

        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", System.getProperty("user.dir") + new File(pathToFile));

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("./src/test/resources/webdrivers/chromedriver.exe"))
                .usingAnyFreePort()
                .build();

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options.merge(capabilities);

        browser.webDriver=new ChromeDriver(service, options);
        System.out.println("_____________________________________________");
        System.out.println(scenario.getName());
      //  browser.webDriver.manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){
        browser.webDriver.quit();
    }


}
