package CRMModuleBRp.pages.pages;
import CRMModuleBRp.pages.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CP_149 {
    public CP_149(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='oe_menu_text'])[18]")
    public WebElement quotationButton;


    @FindBy(xpath = "//div[@class=\"o_control_panel\"]//ol")
    public WebElement headTextActual;


    @FindBy(css = ".o_searchview_input")
    public WebElement searchButton;

}
