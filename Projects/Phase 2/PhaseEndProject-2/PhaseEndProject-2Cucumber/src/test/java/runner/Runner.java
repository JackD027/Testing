package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\eclipse\\PhaseEndProject-2Cucumber\\src\\test\\java\\features\\StarHealth.feature",
	glue = {"steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/myreport2.html",
			  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "timeline:test-output-thread/"
			  },
	publish = true,
	
	monochrome = true // console output will be in more readable format
	
		
		)

public class Runner {

}
