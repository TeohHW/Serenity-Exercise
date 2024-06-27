Feature: Login Form Test

  Background:
    Given User is on the login page

  @web @login
  Scenario Outline: Successful User Authentication
    When User input username '<Username>' and password '<Password>'
    And User submit the login form
    Then User should be authenticated successfully
    Examples:
      | Username | Password |
      | user01   | user01   |
  @web @register
  Scenario: User registration
    When User clicks on sign up button
    Then User should be redirected to registration page

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script