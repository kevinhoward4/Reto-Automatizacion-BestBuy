package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/BuscadorBestBuy.feature",
        glue = "StepDefinition",
        snippets = SnippetType.CAMELCASE)

public class BuscadorBestRunner {
}
