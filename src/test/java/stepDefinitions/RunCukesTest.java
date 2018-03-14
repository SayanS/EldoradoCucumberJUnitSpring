package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"})
@Component
public class RunCukesTest {
}
