package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.YahooHomePage;

public class YahooSteps {

    private WebDriver driver = Hooks.driver;

    YahooHomePage yahooHomePage = new YahooHomePage(driver);

    @Given("^I am on Yahoo home page$")
    public void iAmOnYahooHomePage() throws Throwable {
        yahooHomePage.open();
    }

    @Then("^I type \"([^\"]*)\" in search field$")
    public void iTypeInSearchField(String searchParam) throws Throwable {
        yahooHomePage.searchFor(searchParam);
    }

    @And("^I see result \"([^\"]*)\"$")
    public void iSeeResult(String arg0) throws Throwable {
//        System.out.println(arg0);
    }


}
