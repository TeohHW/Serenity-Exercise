Feature: Deposit Form Test

  Background:
    Given User is logged in with username 'testing123' and password 'Password123' and is on the Deposit page
  @web @deposit
  Scenario Outline: Successful User Deposit to Primary/Savings Account
    When User input account for deposit '<Account Type>'
    And User input the amount for deposit '<Amount>'
    And User submit the deposit
    Then User should deposit successfully
    Examples:
      | Account Type | Amount |
      | Primary   | 5000   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@register
    # to execute the bdd script