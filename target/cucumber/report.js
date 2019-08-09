$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CP_149Cp_107.feature");
formatter.feature({
  "name": "As a user I should not be able to create new Quotations/Invoice",
  "description": "  CP-107",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CP_107"
    }
  ]
});
formatter.scenario({
  "name": "Positive Scenario. As a user I should be able to enter the existing company name, system should show ONLY entered company Quotations CP-149",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CP_107"
    },
    {
      "name": "@CP_149"
    }
  ]
});
formatter.step({
  "name": "User is logged to Brite ERP as user",
  "keyword": "Given "
});
formatter.match({
  "location": "CP149_steps.user_is_logged_to_Brite_ERP_as_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on CRM button",
  "keyword": "And "
});
formatter.match({
  "location": "CP149_steps.user_click_on_CRM_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Quotation",
  "keyword": "And "
});
formatter.match({
  "location": "CP149_steps.user_click_on_Quotation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Search Button and send \"name\"",
  "keyword": "When "
});
formatter.match({
  "location": "CP149_steps.user_click_on_Search_Button_and_send(String)"
});
formatter.result({
  "status": "passed"
});
});