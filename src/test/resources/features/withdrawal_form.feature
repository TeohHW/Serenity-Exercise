Feature: Withdrawal Form Test

  Background:
    Given User is on the withdraw page

  @web @withdraw
  Scenario Outline: Successful User Withdrawal from Primary/Savings Account
    Given User is withdrawing using username '<User Name>' and password '<Password>'
    When User input account for withdrawal '<Account Type>'
    And User input the amount for withdrawal '<Amount>'
    And User submit the withdrawal
    Then User should withdraw successfully
    Examples:
      |User Name| Password | Account Type | Amount |
      | testing123 | Password123 | Primary   | 5000   |
      | testing123 | Password123 | Savings   | 5000   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@withdrawal
    # to execute the bdd script