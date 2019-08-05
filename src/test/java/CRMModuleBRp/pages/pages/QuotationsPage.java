package CRMModuleBRp.pages.pages;

import CRMModuleBRp.pages.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuotationsPage {

    public WebDriver driver;

    public QuotationsPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
}
