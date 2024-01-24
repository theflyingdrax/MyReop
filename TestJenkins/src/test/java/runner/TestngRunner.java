package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		features = {"src/test/resources/features"}, 
		glue= {"stepdefinitions", "hooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				},
		tags= "@loginsmoke"

		)
public class TestngRunner extends AbstractTestNGCucumberTests {
	
}
