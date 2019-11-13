Feature: Login into account
      Existing user should be able to login into account using correct credentials

 Scenario: Log into account with correct credentials
    Given User Navigates to StackOverflow website
    And User clicks on the login link
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the successful login page