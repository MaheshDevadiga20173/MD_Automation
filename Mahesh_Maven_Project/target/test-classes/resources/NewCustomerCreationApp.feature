

Feature: To Create New customer with all details

  Background: 
    Given User open the URL of the application
    And User will enter the username with "mngr583911"
    And User will enter the password with "meqEser"
    When User clicks onLogin button
    Then User will be able to login to the application

  Scenario Outline: Creation of New Customer with all the credentials
    And User will click on the new Customer link in the app
    And User will enter the customer name in app as "<Customer_Name>"
    And User will select the gender in app
    And User will enter dOB in app as "<DOB>"
    And User will enter the addrress in app as "<Address>"

    Examples: 
      | Customer_Name | DOB        | Address   |
      | Ram           | 12-06-1966 | Bangalore |

      
   