package CRMModuleBRp.pages.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "src/test/resources/features",
        glue = "CRMModuleBRp/pages/steps",  // looks inside the package
        tags = "",
        dryRun = false
)
public class Runner {
}
