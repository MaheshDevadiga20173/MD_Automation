@sanity

Feature: Creating a Login Scenario for application

  Scenario Outline: Login Functionality with correct User id and password
    Given User open the URL of the application
    And User will enter the username with "<username>"
    And User will enter the password with "<password>"
    When User clicks onLogin button
    Then User will be able to login to the application

    Examples: 
      | username   | password |
      | mngr583911 | meqEser  |

     