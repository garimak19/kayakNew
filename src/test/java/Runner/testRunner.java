package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features=".//Feature/kayak.feature", 
glue="StepDef",
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output"})
public class testRunner extends AbstractTestNGCucumberTests {


}
