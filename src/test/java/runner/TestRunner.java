package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Scenario", glue = "stepDefinition", dryRun = false)
public class TestRunner {
	
}
