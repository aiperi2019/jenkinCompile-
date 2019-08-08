package CRMModuleBRp.pages.steps;
import CRMModuleBRp.pages.pages.CP_149;
import CRMModuleBRp.pages.pages.HomePage;
import CRMModuleBRp.pages.pages.LoginPage;
import CRMModuleBRp.pages.utilities.ExplicitWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CP149_steps {

    CP_149 page = new CP_149();
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("User is logged to Brite ERP as user")
    public void user_is_logged_to_Brite_ERP_as_user() {
      login.loginToTheWebAppAsUser();
    }

    @Given("User click on CRM button")
    public void user_click_on_CRM_button() throws InterruptedException {
       homePage.goToCRMmodule();
       Thread.sleep(2000);
    }

    @Given("User click on Quotation")
    public void user_click_on_Quotation() throws InterruptedException{
        page.quotationButton.click();
        String headText = "Quotations";
        Thread.sleep(3000);
        System.out.println(headText);
        System.out.println(page.headTextActual.getText());
        Assert.assertTrue("The head text not matching",page.headTextActual.getText().equals(headText));
    }

    @When("User click on Search Button and send {string}")
    public void user_click_on_Search_Button_and_send(String string) {

        ExplicitWait.getWait();
        page.searchButton.sendKeys("Al Shaya"+ Keys.ENTER);
    }



}
