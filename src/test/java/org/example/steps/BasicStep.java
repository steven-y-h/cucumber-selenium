package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class BasicStep {

    private final WebDriver driver = new ChromeDriver();

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String query) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(query);
        element.submit();
    }

    @Then("The page title should start with {string}")
    public void thePageTitleShouldStartWith(String title) {
        boolean pageTitle = driver.getTitle().toLowerCase().startsWith(title);
        assertThat("The page title is wrong", pageTitle);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
