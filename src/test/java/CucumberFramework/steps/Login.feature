Feature: Login into account
      Existing user should be able to login into account using correct credentials

 Scenario: Log into account with correct credentials
    Given User Navigates to StackOverflow website
    And User clicks on the login link
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be taken to the successful login page

  Scenario: Check store logo blockbanner and contact details
    Given User Navigates to Automationpractice HomePage
    Then MyStore logo is displayed
    And Blockbanner offer is displayed
    And Contact phone number is correct
    When User clicks on the Contact us link
    Then Customer service modal is displayed
    And Subject Heading dropdown is displayed
    And User's Email adress is displayed correctly
    And Order reference dropdown is displayed
    And Attach file modal is displayed