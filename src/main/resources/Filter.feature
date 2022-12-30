Feature: Filter
  Scenario: Positive test of filter functionality from high to low prices
    Given I am on the main page
    And I log in with valid user
    Then I go to Спининги section
    And I choose filter option Сначала дорогие
    Then I should see decreasing prices of products
