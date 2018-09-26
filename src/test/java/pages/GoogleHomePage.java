package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

    private WebDriver driver;

    public static By searchInput = By.name("q");
    public static String baseURL = "https:\\www.google.com";

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(baseURL);
    }

    public void searchBy(String query) {
        WebElement element = driver.findElement(searchInput);
        // Enter something to search for
        element.sendKeys(query);
        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
    }
}
