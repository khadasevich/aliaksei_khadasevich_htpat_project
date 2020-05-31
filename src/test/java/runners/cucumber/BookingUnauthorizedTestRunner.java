package runners.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import webdriver.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"tests.bookingsteps"},
        features = {"src/test/resources/features/BookingUnauthorizedTest.feature"
        },
        tags = {"@qa or @prod"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false
)
public class BookingUnauthorizedTestRunner {
    @AfterClass
    public static void tearDown() {
        Driver.quitDriver();
    }
}
