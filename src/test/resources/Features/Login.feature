Feature: test the login functionality

  Scenario: validate admin login
    Given the user navigates to the url
    When user enters  valid email and password
    And clicks on login Button
    Then the user is logged in

  Scenario: validate invalid admin login when username is incorrect
    Given the user navigates to the url
    When user enters a username "AdminXYZA" and password "Hum@nhrm123"
    And clicks on Login Button
    Then the user is not logged in

  Scenario: validate invalid admin login when password is incorrect
    Given the user navigates to the url
    When user enters a username "admin2" and password "abracadabra"
    And clicks on Login Button
    Then the user is not logged in