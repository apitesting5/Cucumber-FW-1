Feature: Authorization

  Scenario: Positive Log in test
    Given I am on the main page
    When I press log in button
    And I fill username and password
    And I press authorization button
    Then User is successfully authorizated

