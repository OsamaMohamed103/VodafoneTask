package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/Features",
        glue = "StepsDef",
        tags = "@Invalid",
        plugin = {"pretty","html:target/cucmber report.html"

        }

        )
public class runner extends AbstractTestNGCucumberTests {
}
