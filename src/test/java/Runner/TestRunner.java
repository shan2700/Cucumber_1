package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/Amazon.feature",
        glue = {"StepDefn_Pack1","StepDefn_Pack2", "StepDefn_Pack3","Web_start"},
        plugin = {"pretty", "html:target/cucumber-reports"}

)
public class TestRunner extends AbstractTestNGCucumberTests {
    
}

