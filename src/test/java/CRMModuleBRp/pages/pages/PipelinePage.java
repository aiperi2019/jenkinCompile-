package CRMModuleBRp.pages.pages;

import CRMModuleBRp.pages.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PipelinePage {
    public WebDriver driver;

    public PipelinePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
}
