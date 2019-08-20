@checking

Feature: o

  Scenario Outline: User should be able to create new Account
    Given User on cybertek training website

    When User clicks on Teachers Option and able to see dropdown menu

    And User clicks on Add Teacher option

    And User should be able to see Add Teacher headed webpage
    And User enters firstName "<first name>"
    And User enters lastName "<last name>"
    And User enters email "<email>"
    And User enters joiningDate "<joining date>"
    And User enters password "<password>"
    And User enters confirmPassword "<confirm password>"
    And User enters subject "<subject>"
    And User enters mobileNumber "<mobile number>"
    And User enters Gender "<gender>"
    And User enters department "<department>"
    And User enters birthDate "<birth date>"
    And User enters salary "<salary>"
    And User enters batch"<batch>"
    And User enters section "<section>"
    And User enters permanentAddress "<permanent address>"
    Then User press SubmitButton;

    Examples:
      |first name|last name|email|joining date|password|confirm password|subject|mobile number|gender|department|birth date|salary|batch|section|permanent address|