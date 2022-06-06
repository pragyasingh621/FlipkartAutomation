
Feature: This will test the search functionality of amazon for same item on flipkart

Scenario: Compare price of  same Item on flipkart and amazon
    Given user navigate to flipkart application
    And user search for "Samsung Galaxy M33 5G" in search box
    When user click the first item
    Then user will be able to print the price of item
    When user click on ADD TO CART to add the item in cart in guest mode
    Then user will be able to print the price from cart
    Given user navigate to amazon application
    And user search for "Samsung Galaxy M33 5G " in search box
    When user click the matching item "Samsung Galaxy M33 5G "
    Then user will be able to print the price of item from amazon
    When user click on ADD TO CART to add the item in cart in guest mode on amazon
    When user navigate to cart
    Then user will be able to print the price from amazon cart
    And user compare the price on flipkart and amazon and print the cheaper price
 