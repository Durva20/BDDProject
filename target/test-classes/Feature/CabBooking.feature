
Feature: Book a cab
  I want to use this template for my feature file

@smoke
  Scenario: Booking cab Sedan
    Given User wants to select car type "Sedan" from uber application
    When User selects car "Sedan" and picjkup point "Mumbai" and drop location "Navi Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1500 rupees
   
   
 @smoke @regression 
  Scenario: Booking cab SUV
    Given User wants to select car type "Suv" from uber application
    When User selects car "Suv" and picjkup point "Mumbai" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 2000 rupees
 
 
 @prod
  Scenario: Booking cab Mini
    Given User wants to select car type "Mini" from uber application
    When User selects car "Mini" and picjkup point "Borivali" and drop location "Dadar"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 800 rupees