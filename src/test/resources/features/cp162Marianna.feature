@cp162/159
Feature: Negative scenario. As a manager I shouldn't be able to type any letters in the phone field

  @cp162
  Scenario:  Phone number field verification
    Given User is logged to BriteBRP account and on Sales_Channel Page
    And User Navigate to any Sales channel in a below list
    And User Navigate and click on a person icon
    And User On the Recipients field  and click's on Create and Edit new Recipient
    And User files all the required fields
    Then User Type in  the Phone field numbers and letters

  @cp159
  Scenario:  Add new Follower field verification
    Given UserManager is logged to BriteBRP account and on Sales_Channel Page
    And UserManager Navigate to any Sales channel in a below list
    And UserManager Navigate and click on a person icon
    And UserManager On the Recipients field  and click's on Create and Edit new Recipient
    And UserManager files all the required fields
    Then UserManager saves all the information
