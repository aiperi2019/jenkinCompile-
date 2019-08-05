package CRMModuleBRp.pages.steps;

import CRMModuleBRp.pages.pages.HomePage;
import CRMModuleBRp.pages.pages.LoginPage;
import CRMModuleBRp.pages.pages.SalesChannelPage;
import CRMModuleBRp.pages.utilities.SoftAssert;
import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cp162_steps {
    SalesChannelPage scp = new SalesChannelPage();
    Faker faker = new Faker();

    @When("User is logged to BriteBRP account and on Sales_Channel Page")
    public void user_is_logged_to_BriteBRP_account_and_on_Sales_Channel_Page() {

        LoginPage login = new LoginPage();
        login.loginToTheWebAppAsManager();

        HomePage hPage = new HomePage();
        hPage.goToCRMmodule();

        scp.SalesChannelField.click();
    }

    @And("User Navigate to any Sales channel in a below list")
    public void user_Navigate_to_any_Sales_channel_in_a_below_list() {
        scp.EuropeSalesChannel.click();

    }

    @And("User Navigate and click on a person icon")
    public void user_Navigate_and_click_on_a_person_icon() {
        scp.AddFollowerIcon.click();
        scp.AddFollowerButton.click();
    }

    @Given("User On the Recipients field  and click's on Create and Edit new Recipient")
    public void user_In_the_Recipients_field_click_on_Create_and_Edit_new_Recipient() {
        scp.dropDownAddContacts.click();
        scp.Create.click();
    }

    @And("User files all the required fields")
    public void user_files_all_the_required_fields() {
        scp.NameInput.sendKeys(faker.company().name());
        scp.jobPosition.sendKeys(faker.job().position());
        scp.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("User Type in  the Phone field numbers and letters")
    public void user_Type_in_the_Phone_field() {

        scp.phoneField.sendKeys(faker.phoneNumber().cellPhone());
        scp.phoneField.sendKeys(faker.funnyName().name());
        scp.saveButton.click();

        SoftAssert.getSoftAssert().assertThat(scp.sendEmailCheckBox.isEnabled());

        String actualText = scp.textOfEmail.getText();
        String expectedText = "Hello,\n" + "EventsCRM_Manager7 invited you to follow Sales Channel document: Europe";
        SoftAssert.getSoftAssert().assertThat(actualText.compareTo(expectedText));

        scp.addFollowerButtonBeforeSave.click();

        SoftAssert.getSoftAssert().assertAll();
    }
}
