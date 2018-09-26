package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setupBrowser() {
        String propKey = "webdriver.gecko.driver";
        String propValue = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty(propKey, propValue);
        driver = new FirefoxDriver();

    }

    @After()
    public void closeBrowser(Scenario scenario) {
        ifFailed(scenario);
        driver.quit();
    }

    public void ifFailed(Scenario scenario){
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }

    }
}
