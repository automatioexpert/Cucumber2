Feature: App Login feature

  Scenario: Login to AUT
    Given user has launched the url
    When user has entered the pwd and username
    And user click on login button
    Then user is logged in successfully

  Scenario: Login to DB
    Given user has launched the url
    When user has entered the pwd and username
    And user click on login button
    Then user is logged in successfully
