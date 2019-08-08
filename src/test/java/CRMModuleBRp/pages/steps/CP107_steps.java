package CRMModuleBRp.pages.steps;
import CRMModuleBRp.pages.pages.CP_107Page;
import CRMModuleBRp.pages.pages.HomePage;
import CRMModuleBRp.pages.pages.LoginPage;
import CRMModuleBRp.pages.utilities.ExplicitWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CP107_steps {

    CP_107Page page = new CP_107Page();
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User is logged to Brite ERP as a user")
    public void user_is_logged_to_Brite_ERP_as_a_user() {
login.loginToTheWebAppAsUser();

    }

    @Given("User on CRM page")
    public void user_on_CRM_page() {
homePage.goToCRMmodule();
    }

    @Given("User click on Quotation button")
    public void user_click_on_Quotation_button()throws InterruptedException {
        page.quotationButton.click();
        Thread.sleep(2000);
    }

    @Then("User click on Create button")
    public void user_click_on_Create_button()throws InterruptedException {
        Thread.sleep(2000);
         page.create.click();
        String labelText = "Quotations";
       Assert.assertTrue(page.labelTextDisplayed.getText().contains(labelText));
        ExplicitWait.getWait();
    }

    @Then("User on New Popup window click on Add Item button")
    public void user_on_New_Popup_window_click_on_Add_Item_button() {
        page.addAnItemButton.click();

    }

    @Then("User on Popup Create Order Lines window on Product field fill out with {string} value")
    public void user_on_Popup_Create_Order_Lines_window_on_Product_field_fill_out_with_value(String string ) {
     page.product.sendKeys("\"CAP\"");
        ExplicitWait.getWait();
        page.product.click();
    }

    @Then("User click Save&Close button")
    public void user_click_Save_Close_button() {
      page.saveClose.click();
        ExplicitWait.getWait();
    }

    @Then("User click on Create button on new pop up Create a Product window")
    public void user_click_on_Create_button_on_new_pop_up_Create_a_Product_window() {

    }

    @When("Create: Product popup window appear")
    public void create_Product_popup_window_appear() {
     page.create2.click();
    }

    @When("User click on Save button")
    public void user_click_on_Save_button() {
      page.save.click();
    }

    @Then("User should see Odoo Server Error")
    public void user_should_see_Odoo_Server_Error() {
        String errorSentenceHeader = "Create Order Lines";
        Assert.assertTrue("The error text Not Displayed",page.errorHeader.getText().equals(errorSentenceHeader));
    }

}
