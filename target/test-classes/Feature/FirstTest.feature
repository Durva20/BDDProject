Feature: Amazon search
  
  Scenario: Search a product
    Given I have a search field on amazon page
    When I search for a product with "Apple macbook" and price 1000   
    Then Product with name "Apple macbook" should be displayed