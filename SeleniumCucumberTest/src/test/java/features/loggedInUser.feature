@First
Feature: LoggedIn User View

  @loggedInUser
  Scenario: Validate user is able to view after log in
    Given User navigates to the login page
    When User successfully enters the login details
    Then User should be able to view the product category page

  @addToCart
  Feature: Add product to cart
  Scenario: User add a product to cart
    Given User navigates to the store page
    When User click buy
    Then User successfully add to cart
