package pages;

import org.openqa.selenium.WebDriver;

public class YahooHomePage {

    private WebDriver driver;

    public YahooHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static String baseURL = "https://www.yahoo.com";

    public void open() {
        driver.get(baseURL);
    }

}
