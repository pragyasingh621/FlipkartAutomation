
Feature: Search Item
  
  Scenario: Search Item and Add it to cart
    Given user navigate to flipkart application
    And user search for "samsung mobiles" in search box
    When user click the first item
    Then user will be able to print the price of item
    When user click on ADD TO CART to add the item in cart in guest mode
    And user increase the quantity of item by one
    Then user will be able to print the price after addition

  
