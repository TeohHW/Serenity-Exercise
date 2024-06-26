Feature: Login Form Test

  Background:
    Given User is on the login page

  Scenario Outline: Successful User Authentication
    When User input username '<Username>' and password '<Password>'
    And User submit the login form
    Then User should be authenticated successfully

    Examples:
      | Username | Password |
      | user01   | user01   |

    # run in terminal
    # mvn clean verify
    # to execute the bdd script