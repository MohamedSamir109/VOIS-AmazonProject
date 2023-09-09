Feature: Testing adding item to the cart feature

  Scenario: Check adding a car accessory item to the cart is successful
    Given The user opens the Amazon home page
    When Entering a text car accessories in search box
    And Pressing search button
    And Choosing the first item
    And Pressing Add to cart button
    And Pressing GO to cart button
    Then Checking the presence of the item
    And Closing browser


  Scenario: Selecting an items and add them to the cart
    Given The user opens the Amazon website
    When Press today's deals button
    And Choose Headphones
    And Choose Grocery
    And Choose the required discount
    And Move to Page3
    And Press next page
    And Select an item
    And Press add to cart button
    And Close browser