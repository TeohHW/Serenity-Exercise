Feature: Registration Form Test

  Background:
    Given User is on the login page

  @web @register
  Scenario Outline: Successful User Registration

    Examples:
      | Username | Password |
      | user01   | user01   |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@register
    # to execute the bdd script