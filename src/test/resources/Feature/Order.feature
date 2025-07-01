Feature: Amazon order page
  In order to check my order details
  As a registered user
  I want to specify feature of order details page

Background:
Given A registered user exist
    Given User is on amazon login oage
    When User enters username
    And User enters password
    And User clicks on login button
    Then User navigates to orders page

  Scenario: Check prevoius order details
    When User clicks on orders link
    Then User checks previous order details

  Scenario: Check open order details
    When User clicks on open orders link
    And User checks open order details
    
    Scenario: Check cancelled order details
     When User clicks on cancelled orders link
    Then User cancelled Cancelled order details
