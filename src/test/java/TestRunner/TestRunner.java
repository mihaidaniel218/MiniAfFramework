package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features="d:\\Projects\\MiniAfFramework\\src\\test\\java\\CucumberFramework\\steps\\Login.feature",
                glue="LoginSteps")
public class TestRunner {
}
