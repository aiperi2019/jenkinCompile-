package CRMModuleBRp.pages.pages;

import CRMModuleBRp.pages.utilities.Config;
import CRMModuleBRp.pages.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#login")
    public WebElement loginEmailBox;

    @FindBy(css = "#password")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    public void loginToTheWebAppAsManager(){
        Driver.getDriver().get(Config.getProperty("url"));
        loginEmailBox.sendKeys(Config.getProperty("usernameManager"));
        loginPasswordBox.sendKeys(Config.getProperty("passwordManager"));
        loginButton.click();
    }

    public void loginToTheWebAppAsUser(){
        Driver.getDriver().get(Config.getProperty("url"));
        loginEmailBox.sendKeys(Config.getProperty("usernameUser"));
        loginPasswordBox.sendKeys(Config.getProperty("passwordUser"));
        loginButton.click();

    }

}
