package Day19;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Day19/Features",
        glue = "Day19.StepDefs",
        tags = "@SauceDemo", monochrome = true,dryRun = false,
        plugin = {"pretty","html:target/cucumber-report.html", "json: target/cucumber-test-report.json"}

)
public class TestRunner extends AbstractTestNGCucumberTests {



}
