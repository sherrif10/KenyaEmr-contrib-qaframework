Feature: User Login

  Background:
    Given User visits login page

  @login
  Scenario Outline: Failing or Succeeding to Login
    When User enters "<username>" username
    And User enters "<password>" password
    And User click on login button
    Then System Evaluates Login "<status>"
    And  The system go to homePage
    Examples:
      | username  | password  | status |
      | admin     | Admin123  |true   |
