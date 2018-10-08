package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html"},
        glue = {"steps", "hooks"},
        features = {
                "classpath:features/yahoo.feature"
        })
public class RunCukesTest {
}
