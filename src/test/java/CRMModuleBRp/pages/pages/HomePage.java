package CRMModuleBRp.pages.pages;

import CRMModuleBRp.pages.utilities.Driver;
import CRMModuleBRp.pages.utilities.ExplicitWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    public WebDriver driver;

    public HomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@data-menu='261']")
    public WebElement CRMModule;

    public void goToCRMmodule(){
        ExplicitWait.getWait().until(ExpectedConditions.elementToBeClickable(CRMModule));
        CRMModule.click();
    }
}
