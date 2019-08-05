package CRMModuleBRp.pages.utilities;

import org.assertj.core.api.SoftAssertions;

public class SoftAssert {

    private static SoftAssertions softAssert;

    public static SoftAssertions getSoftAssert(){
        if(softAssert == null){
            softAssert = new SoftAssertions();
        }
        return softAssert;
    }
}
