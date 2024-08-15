

Feature: To Edit New customer details

  Background: 
    Given User open the URL of the application
    And User will enter the username with "mngr583911"
    And User will enter the password with "meqEser"
    When User clicks onLogin button
    Then User will be able to login to the application

  Scenario Outline: Edit New customer details
    And User will click on the Edit Customer link in the app
    And User will enter the CustomerID as "<Cust_ID>"
    When the User clicks on Submit
    And User amend the address in App as "<Address>"
    And User amend the pin as "<PIN>"
    And User amend the Mobile Number as "1100990022"
    Then user clicks on submit

    Examples: 
      | Cust_ID | Address             | PIN    |
      |    6076 | Karnataka Bangalore | 456584 |
