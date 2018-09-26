package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.GoogleHomePage;
import pages.SearchResultsPage;

public class SearchSteps {

    private WebDriver driver = Hooks.driver;

    GoogleHomePage googleHomePage = new GoogleHomePage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);


    @Given("^I am on the Google search page$")
    public void I_visit_google() {
        googleHomePage.open();
    }

    @When("^I search for \"(.*)\"$")
    public void search_for(String query) {
        googleHomePage.searchBy(query);
    }

    @Then("^the page title should start with \"(.*)\"$")
    public void checkTitle(String titleStartsWith) {
        searchResultsPage.waitTillTitleIs(titleStartsWith);
    }
}