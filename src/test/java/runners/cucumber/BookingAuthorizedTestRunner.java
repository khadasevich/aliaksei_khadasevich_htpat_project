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
        features = {"src/test/resources/features/BookingAuthorizedTest.feature"
        },
        tags = {"@qa or @prod"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        strict = false
)
public class BookingAuthorizedTestRunner {

//        private static final String BOOKING_URL = "https://www.booking.com/";
//        private static final String password = "123456QW";
//        private static final String filePath = "src/test/resources/testdata/testuser";
//
//        @BeforeClass
//        public static void setUp() throws IOException, InterruptedException {
//                WebDriver driver = Driver.getWebDriver();
//                Driver.setTimeout();
//                String email = GenerateFakeAddress.generateEmail();
//                TestUser testuser = new TestUser(email, password);
//                MyJsonParser.saveJsonToFile(filePath, testuser);
//                Registration.performRegistration(driver, email, password, BOOKING_URL);
//                Driver.quitDriver();
//        }

        @AfterClass
        public static void tearDown() {
                Driver.quitDriver();
        }
}
