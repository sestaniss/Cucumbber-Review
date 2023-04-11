Feature: test the login functionality

  Scenario: validate admin login
    Given the user navigates to the url
    When user enters  valid email and password
    And clicks on login Button
    Then the user is logged in

  Scenario: validate admin login part2
    Given the user navigates to the url
    When user enters  valid email "admin2" and password "troy"
    And clicks on login Button
    Then the user is logged in