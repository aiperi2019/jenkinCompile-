package CRMModuleBRp.pages.pages;

import CRMModuleBRp.pages.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesChannelPage {
    public WebDriver driver;

    public SalesChannelPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath ="//a[@href = '/web#menu_id=267&action=242']")
    public WebElement SalesChannelField;

    @FindBy (xpath = "//table[@class = 'o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody//tr[2]/td[2]")
    public WebElement EuropeSalesChannel;

    @FindBy (xpath = "//div[@class = 'o_followers_title_box']//button[@class='btn btn-sm btn-link dropdown-toggle'] ")
    public WebElement AddFollowerIcon;

    @FindBy (linkText = "Add Followers")
    public WebElement AddFollowerButton;

    @FindBy (xpath ="//div[@class = 'o_field_many2manytags o_input o_field_widget']//div[@class='o_input_dropdown'] ")
    public WebElement dropDownAddContacts;

    @FindBy (xpath ="//li[@class = 'o_m2o_dropdown_option ui-menu-item'][2]")
    public WebElement Create;


    @FindBy (xpath ="//div[@class = 'oe_title']//input[@name = 'name']")
    public WebElement NameInput;


    @FindBy (xpath ="//table[@class = 'o_group o_inner_group']//tbody//tr//td//input[@class ='o_field_char o_field_widget o_input']")
    public WebElement jobPosition;


    @FindBy (xpath ="//table[@class = 'o_group o_inner_group']//tbody//tr//td//input[@class ='o_field_email o_field_widget o_input o_required_modifier']")
    public WebElement emailBox;


    @FindBy (xpath = "//table[@class = 'o_group o_inner_group']//tbody//tr//td//input[@name = 'phone'] ")
    public WebElement phoneField;

    @FindBy(xpath = "//span [.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@name ='send_mail']")
    public WebElement sendEmailCheckBox;

    @FindBy(xpath = "//div[@class = 'note-editing-area']//div[@class = 'note-editable panel-body']")
    public WebElement textOfEmail;

    @FindBy(xpath = "//div[@class ='modal-footer']//div//button//span[.='Add Followers']")
    public  WebElement addFollowerButtonBeforeSave;


}
