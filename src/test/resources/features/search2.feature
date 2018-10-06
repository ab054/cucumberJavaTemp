Feature: as a User I can search

  Scenario: Finding some cheese
    Given I am on the Yahoo search page
    When I looking for "Cheese!"
    Then assert that title should start with "cheese"
