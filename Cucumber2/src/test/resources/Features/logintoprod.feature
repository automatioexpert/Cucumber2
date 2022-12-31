@bvt
Feature: Login to production
  
  In order to perford successful login to production

  Scenario Outline: In order to verify login to Gmail
    Given user navigates to gmail login page
    When user validates the homepage title
    Then user entered "<username>" username
    And user entered "<password>" password
    And user select the age category
      | Age      | location |
      | below 18 | india    |
      | above 18 | USA      |
    Then user "loginType" successfully logged in

    Examples: 
      | username | password | loginType |
      | valid    | valid    | should    |
      | valid    | ivalid   | shouldnot |
      | invalid  | valid    | shouldnot |
      | invalid  | invalid  | shouldnot |
      | valid    | valid    | should    |
