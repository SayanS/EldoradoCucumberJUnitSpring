package utils;

import models.Browser;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Attachment;
@Component
public class ScreenshotOnFailureRule implements TestRule {
    @Autowired
    Browser browser;
    public Statement apply(final Statement statement, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                } catch (Throwable t) {
                    captureScreenshot();
                    throw t;
                }
            }

            @Attachment
            private byte[] captureScreenshot() {
                try {
                    return ((TakesScreenshot)browser.webDriver).getScreenshotAs(OutputType.BYTES);
                } catch (Exception e) {
                   return null; // No need to crash the tests if the screenshot fails
                }
            }
        };
    }
}