package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/addition.feature",
        glue = "additionstepdef",
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner1 extends AbstractTestNGCucumberTests {


}
