Feature: E-commerce Checkout

  Scenario: Adding items to the cart
    Given the user is on the e-commerce website
    When the user adds a product to the cart
    Then the cart should contain the product

  Scenario: Completing the purchase
    Given the user has items in the cart
    When the user proceeds to checkout
    Then the user should receive a confirmation email
