@CP_107
Feature: As a user I should not be able to create new Quotations/Invoice
  CP-107

  Scenario: Negative Scenario. User should not able to create neq Quotation
    Given User is logged to Brite ERP as a user
    And User on CRM page
    And User click on Quotation button
    Then  User click on Create button
    And User on New Popup window click on Add Item button
    And User on Popup Create Order Lines window on Product field fill out with "given" value
    And User click Save&Close button
    And User click on Create button on new pop up Create a Product window
    When Create: Product popup window appear
    And User click on Save button
    Then User should see Odoo Server Error



@CP_149
  Scenario: Positive Scenario. As a user I should be able to enter the existing company name, system should show ONLY entered company Quotations CP-149
    Given User is logged to Brite ERP as user
    And User click on CRM button
    And User click on Quotation
    When User click on Search Button and send "name"







