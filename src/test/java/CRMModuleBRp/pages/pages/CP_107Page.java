package CRMModuleBRp.pages.pages;
import CRMModuleBRp.pages.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CP_107Page {

    public CP_107Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid=\"sale_crm.sale_order_menu_quotations_crm\"]" )
     public WebElement quotationButton;

   @FindBy(xpath = "(//div[@class=\"o_list_buttons\"]//button)[1]")
    public WebElement create;

@FindBy (xpath = "//div[@class=\"o_control_panel o_breadcrumb_full\"]")
  public WebElement labelTextDisplayed;

@FindBy(linkText = "Add an item")
public  WebElement addAnItemButton;


@FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[17]")
    public WebElement product;



@FindBy  (xpath = "//button[@class='btn btn-sm btn-primary'][1]")
        public WebElement saveClose;



    @FindBy(xpath = "//span[.='Create']")
    public WebElement create2;



    @FindBy(xpath = "//span[.='Save']")
    public WebElement save;

@FindBy(xpath = "(//h4[@class='modal-title'])[1]")
    public WebElement errorHeader;



}
