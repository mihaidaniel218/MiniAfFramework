package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features={"d:\\Projects\\MiniAfFramework\\src\\test\\java\\CucumberFramework\\steps\\Login.feature"},
                glue={"CucumberFramework.steps"},
                monochrome = true,
                tags = {}
)

public class TestRunner {
}
