Feature: To test Login functionality

  Scenario: Login is successful with valid credential
    Given user is on login page
    When user enters username and password
    And clicks on Loign button
    Then user is navigated to the homepage
