Feature: User Registration

  Scenario: verify Registration with mandatory fields
    Given User navigates to Registration account page
    When User enters below details into the fields
      | firstname       | Allua                |
      | lastname        | Arjunb               |
      | emailaddress    | Allua1rjun@gmail.com |
      | telephone       |          9848035914 |
      | password        |               123459 |
      | confirmpassword |               123459 |
    And select the privacy policy field
    And click on continue button
    Then Account should get successfully created
    
    
