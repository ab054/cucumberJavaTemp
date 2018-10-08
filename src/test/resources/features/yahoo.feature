Feature: Yahoo search tests

  Scenario: Yahoo search input
    Given I am on Yahoo home page
    Then I type "QA" in search field
    And I see result "Test automation"

