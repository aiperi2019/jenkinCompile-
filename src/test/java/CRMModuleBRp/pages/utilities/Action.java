package CRMModuleBRp.pages.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

    private static Actions actions;

    public Action(WebDriver driver){

    }
    public static Actions getActions(){

        if( actions == null){
            actions = new Actions(Driver.getDriver());
        }

        return actions;
    }
}
