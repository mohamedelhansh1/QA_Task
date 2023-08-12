Feature: As a user, I want to login and logout

  Scenario Outline: The user is able to complete End to End scenario
    Given the user redirect to login page
    When Submit email using "<email>" and password using "<password>"
    When Click on login button
    Then Success login and redirect to home page
    Then the user clicks on the logout button
    Then the user logout and redirect to login page
    Examples:
      | email           | password |
      | store@admin.com | P@ssw0rd |

