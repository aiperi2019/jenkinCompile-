package CRMModuleBRp.pages.steps;

import CRMModuleBRp.pages.pages.HomePage;
import CRMModuleBRp.pages.pages.LoginPage;
import CRMModuleBRp.pages.pages.SalesChannelPage;
import CRMModuleBRp.pages.utilities.SoftAssert;
import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cp159_steps {

    SalesChannelPage scp = new SalesChannelPage();
    Faker faker = new Faker();

    @Given("UserManager is logged to BriteBRP account and on Sales_Channel Page")
    public void usermanager_is_logged_to_BriteBRP_account_and_on_Sales_Channel_Page() {
        LoginPage login = new LoginPage();
        login.loginToTheWebAppAsManager();

        HomePage hPage = new HomePage();
        hPage.goToCRMmodule();

        scp.SalesChannelField.click();

    }

    @Given("UserManager Navigate to any Sales channel in a below list")
    public void usermanager_Navigate_to_any_Sales_channel_in_a_below_list() {
        scp.EuropeSalesChannel.click();
    }

    @Given("UserManager Navigate and click on a person icon")
    public void usermanager_Navigate_and_click_on_a_person_icon() {
        scp.AddFollowerIcon.click();
        scp.AddFollowerButton.click();
    }

    @Given("UserManager On the Recipients field  and click's on Create and Edit new Recipient")
    public void usermanager_On_the_Recipients_field_and_click_s_on_Create_and_Edit_new_Recipient() {
        scp.dropDownAddContacts.click();
        scp.Create.click();
    }

    @Given("UserManager files all the required fields")
    public void usermanager_files_all_the_required_fields() {
        scp.NameInput.sendKeys(faker.company().name());
        scp.jobPosition.sendKeys(faker.job().position());
        scp.emailBox.sendKeys(faker.internet().emailAddress());
        scp.phoneField.sendKeys(faker.phoneNumber().cellPhone());
    }

    @Then("UserManager saves all the information")
    public void usermanager_saves_all_the_information() {
        scp.saveButton.click();

        SoftAssert.getSoftAssert().assertThat(scp.sendEmailCheckBox.isEnabled());

        String actualText = scp.textOfEmail.getText();
        String expectedText = "Hello,\n" + "EventsCRM_Manager7 invited you to follow Sales Channel document: Europe";
        SoftAssert.getSoftAssert().assertThat(actualText.compareTo(expectedText));

        scp.addFollowerButtonBeforeSave.click();

        SoftAssert.getSoftAssert().assertAll();
    }

}
