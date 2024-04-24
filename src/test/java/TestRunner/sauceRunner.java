package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/Features"},
				glue = {"StepDefinitions"},
				plugin = {"pretty","html:target/htmlreport.html"}
				)

public class sauceRunner extends AbstractTestNGCucumberTests {

}
