@PageObjectModelsFeature
Feature: Page Object Models Feature

  @PageObjectModelsScenario
  Scenario: Finding some cheese
    Given [PageObjectModels] I am on the Google search page
    When [PageObjectModels] I search for "Cheese!"
    Then [PageObjectModels] The page title should start with "cheese"