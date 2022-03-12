package cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"classpath:cucumber/stepDefs", "cucumber/hooks"},
        features = "src/test/resources/cucumber.features/",
        stepNotifications = true,
        publish = true
)

public class CucumberRunner {
}
