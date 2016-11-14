package jenkins.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(strict = true,plugin = {"pretty", "html:target/cucumber/", "json:target/cucumber/cucumber.json", "usage:target/cucumber/cucumber-usage.json", "rerun:target/rerunFailedTests.txt"},format="json:target/cucumber.json",features="src/test/resources/features/sample.feature",tags = { "~@skip" })
public class DefinitionTestSuite {}
