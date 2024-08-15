@sanity
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
    And User will enter the city in app as "<City>"
    And User will enter the state in app as "<State>"
    And User will enter the pincode in app as "<PIN>"
    And User will enter the mobile Number in app as "<Mobile_Number>"
    And User will enter the emaiul in app as "<Email>"
    And User will enter the password in app as "<Password>"
    When User clicks on Submit button

    Examples: 
      | Customer_Name | DOB        | Address   | City | State     | PIN    | Mobile_Number | Email              | Password |
      | Rohan KC      | 12-06-1980 | Bangalore | KVN  | Karnataka | 123457 |    9988776653 | abc451@gmail20.com |   123456 |
