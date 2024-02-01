@login
Feature: Login

  @positive-valid-login
  Scenario: Login with valid username and password
    Given user is on login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user is on homepage

  @negative-invalid-login
  Scenario: Login with username and invalid password
    Given user is on login page
    When user input username "standard_user"
    And user input password "invalid"
    And user click login button
    Then user able to see error messages "Epic sadface: Username and password do not match any user in this service"

  @boundary-valid-login
  Scenario: Verify login with valid credentials
    Given user is on login page
    When user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    Then user is on homepage

  @boundary-invalid-login
  Scenario: Verify login without password
    Given user is on login page
    When user input username "standard_user"
    And user click login button
    Then user should see an error message "Epic sadface: Password is required"
