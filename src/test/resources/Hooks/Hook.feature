Feature: verify signin functionality

  Background: 
  Given user is on signin page

  Scenario: verify signin with valid data
    When user enters valid UN and PWD
    And user clicks on Signin button
    Then user navigated to the next page

  Scenario: verify signin with valid data
    When user enters valid UN and PWD
    And user clicks on Signin button
    Then user navigated to the next page
