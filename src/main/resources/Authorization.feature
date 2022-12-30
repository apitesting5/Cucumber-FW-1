Feature: Authorization

  Scenario Outline: Positive Log in test
    Given I am on the main page
    When I press log in button
    And I fill <username> and <password>
    And I press authorization button
    Then I should see Личный кабинет and user is authorized
    Examples:
      | username                   | password  |
      | ferenousacalifor@gmail.com | Lipton111 |


