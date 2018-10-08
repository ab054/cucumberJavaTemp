Feature: as a User I can search

Scenario: Finding some cheese
  Given I am on the Google search page
  When I search for "Cheese!"
  Then the page title should start with "cheese"

  Scenario: Verify other search param
    Given I am on the Google search page
    When I search for "Portnov computer school"
    Then the page title should start with "QA"


  Scenario Outline: Finding some cheese
    Given I am on the Google search page
    When I search for "<searchParam>"
    Then the page title should start with "cheese"
  Examples:
    |searchParam|
    |Cheese!    |
    | QA        |


  Scenario Outline: Finding some cheese
    Given I am on the Google search page
    When I search for "<searchParam>"
    Then the page title should start with "<result>"
    Examples:
      |searchParam| result |
      |Cheese!    | asf    |
      | QA        | asd    |