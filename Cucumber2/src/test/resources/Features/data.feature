Feature: Data driven test feature

  Scenario: Data driven test
    Given user has loaded the data
    Then user select the category
      | Age      |
      | below 18 |
      | above 18 |
      | above 60 |
      | above 90 |
