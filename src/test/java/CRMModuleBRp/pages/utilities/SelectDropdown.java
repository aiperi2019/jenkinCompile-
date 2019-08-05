package CRMModuleBRp.pages.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
    private static Select select;

    public static Select getSelect(WebElement element){
        if(select == null){
            select = new Select(element);
        }
        return select;
    }
}
