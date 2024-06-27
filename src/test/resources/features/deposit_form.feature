Feature: Deposit Form Test

  Background:
    Given User is on the deposit page

  @web @depositPrimary
  Scenario Outline: Successful User Deposit to Primary Account
    When User input account '<Account Type>' and amount '<Amount>'
    And User submit the deposit
    Then User should deposit successfully
    Examples:
      | Account Type | Amount |
      | Primary   | $5000   |

  @web @depositSavings
  Scenario Outline: Successful User Deposit to Savings Account
    When User input account '<Account Type>' and amount '<Amount>'
    And User submit the deposit
    Then User should deposit successfully
    Examples:
      | Account Type | Amount |
      | Savings   | $5000   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@register
    # to execute the bdd script