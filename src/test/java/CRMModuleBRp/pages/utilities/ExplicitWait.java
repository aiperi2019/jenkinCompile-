package CRMModuleBRp.pages.utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    private static WebDriverWait wait;
    private ExplicitWait(){

    }

    public static WebDriverWait getWait(){

        if(wait == null){
            wait = new WebDriverWait(Driver.getDriver(),20);

        }

        return wait;

    }
}
