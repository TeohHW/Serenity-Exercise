Feature: Deposit Form Test

  Background:
    Given User is on the deposit page

  @web @deposit
  Scenario Outline: Successful User Deposit to Primary/Savings Account
    Given User is depositing using username '<User Name>' and password '<Password>'
    When User input account for deposit '<Account Type>'
    And User input the amount for deposit '<Amount>'
    And User submit the deposit
    Then User should deposit successfully
    Examples:
      |User Name| Password | Account Type | Amount |
      | testing123 | Password123 | Primary   | 5000   |
      | testing123 | Password123 | Savings   | 5000   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@register
    # to execute the bdd script