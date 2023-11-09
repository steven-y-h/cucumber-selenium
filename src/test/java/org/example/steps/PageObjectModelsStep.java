package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.PageObjectModelsPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class PageObjectModelsStep {
    PageObjectModelsPage pageObjectModelsPage = new PageObjectModelsPage();

    @Given("[PageObjectModels] I am on the Google search page")
    public void pageobjectmodelsIAmOnTheGoogleSearchPage() {
        pageObjectModelsPage.openGoogle();
    }

    @When("[PageObjectModels] I search for {string}")
    public void pageobjectmodelsISearchFor(String query) {
        pageObjectModelsPage.inputSearch(query);
    }

    @Then("[PageObjectModels] The page title should start with {string}")
    public void pageobjectmodelsThePageTitleShouldStartWith(String title) {
        boolean pageTitle = pageObjectModelsPage.isThePageTitleStartWith(title);
        assertThat("The page title is wrong", pageTitle);
    }
}
