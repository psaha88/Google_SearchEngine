package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        features = "Feature",
        glue= "steps"
)
public class testRunner extends AbstractTestNGCucumberTests {
}
