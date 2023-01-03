Feature: Unsuccessful Authorization

  Scenario Outline: Negative Log in test with invalid password
    Given I am on the main page
    When I press log in button
    And I fill <username> and <invalidPassword>
    And I press authorization button
    Then I should see alert Неверные данные.
    Examples:
      | username                   | invalidPassword |
      | ferenousacalifor@gmail.com | Qwerty5         |