@carwale
Feature: validation of car search page
  In order to validate car  search

  Scenario: validation of new car
    Given: I am on the home page
    When I move to Car for sale menu
    Then I click on search cars
    And I select make as BMW
