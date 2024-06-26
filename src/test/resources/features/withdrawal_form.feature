Feature: Withdrawal Form Test

  Background:
    Given User is on the login page

  @web @withdrawal
  Scenario Outline: Successful User Withdrawal
    
    Examples:
      | Username | Password |
      | user01   | user01   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@withdrawal
    # to execute the bdd script