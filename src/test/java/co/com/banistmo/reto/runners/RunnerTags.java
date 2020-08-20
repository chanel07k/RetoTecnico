package co.com.banistmo.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/tocumenpdf.feature",
        tags = "@Scenario1",
        glue = "co.com.banistmo.reto",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
