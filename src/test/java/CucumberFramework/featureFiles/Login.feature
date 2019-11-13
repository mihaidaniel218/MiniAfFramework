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

  Scenario: Check product buttons font size and submenu composition
    Given User Navigates to Automationpractice HomePage
    When User hovers over the Women button tab
    Then tooltip "women" is displayed
    And Tops and Dresses sub-menus show up
    And Tops submenu has two entries
    And Dresses submenu has three entries
    When user hovers over the Dresses button tab
    Then tooltip "dresses" is displayed
    And Casual Evening and Summer Dresses submenus are displayed
    When user hovers over the T-shirts button tab
    Then tooltip "t-shirts" is displayed
