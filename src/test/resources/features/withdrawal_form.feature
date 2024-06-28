Feature: Withdrawal Form Test

  Background:
    Given User is logged in with username 'testing123' and password 'Password123' and is on the Withdraw page

  @web @withdraw
  Scenario Outline: Successful User Withdrawal from Primary/Savings Account
    When User input account for withdrawal '<Account Type>'
    And User input the amount for withdrawal '<Amount>'
    And User submit the withdrawal
    Then User should withdraw successfully
    Examples:
      | Account Type | Amount |
      | Primary   | 5000   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@withdrawal
    # to execute the bdd script