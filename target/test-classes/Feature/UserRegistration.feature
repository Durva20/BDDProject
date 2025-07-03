Feature: User registration



  Scenario: User registration with different data
    Given User is on registration page
    When User enters following user details
    |Durva|Mehta|Mumbai|172634|
    |Abc  |Xyz  |Chennai|19283|
    Then User registration successful
   
  Scenario: User registration with different data with columns
    Given User is on registration page
    When User enters following user details with columns
    |FirstName|LastName|City		|Phone|
    |Durva		|Mehta	 |Mumbai	|172634|
    |Abc  		|Xyz  	 |Chennai |19283|
    Then User registration successful