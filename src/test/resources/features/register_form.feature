Feature: Registration Form Test

  Background:
    Given User is on the registration page

  @web @register
  Scenario Outline: Successful User Registration
    When User input firstName '<First Name>'
    And User input  lastName '<Last Name>'
    And User input  phone '<Phone>'
    And User input  emailAddress '<Email Address>'
    And User input  username '<Username>'
    And User input  password '<Password>'
    Then User should be registered successfully
    Examples:
      | First Name| Last Name | Phone | Email Address | Username | Password |
      | John  |   Doe     | 987654321 | JohnDoe@email.com| JohnDoe | Password123 |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@register
    # to execute the bdd script