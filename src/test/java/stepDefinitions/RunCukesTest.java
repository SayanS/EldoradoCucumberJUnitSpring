package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"/spring.xml"})
@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(features = {"src/test/resources/features"}
//        plugin ={"html:target/cucumber-html-report",
//        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
//        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" })
)
@Component
public class RunCukesTest {
}
