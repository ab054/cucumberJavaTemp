package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.YahooHomePage;

public class YahooSteps {

    private WebDriver driver = Hooks.driver;

    YahooHomePage yahooHomePage = new YahooHomePage(driver);

    @Given("^I am on the Yahoo search page$")
    public void iAmOnTheYahooSearchPage() throws Throwable {
        yahooHomePage.open();
    }

    @When("^I looking for \"([^\"]*)\"$")
    public void iLookingFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^assert that title should start with \"([^\"]*)\"$")
    public void assertThatTitleShouldStartWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
