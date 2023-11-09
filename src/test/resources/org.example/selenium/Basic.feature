Feature: Basic Feature

  @BasicScenario
  Scenario: Finding some cheese
    Given I am on the Google search page
    When I search for "Cheese!"
    Then The page title should start with "cheese"