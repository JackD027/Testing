package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\eclipse\\ReqRes\\src\\test\\java\\feature\\FeatureFile.feature",
	glue = {"step"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/CucumberReport.html",
			  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "timeline:test-output-thread/"
			  },
	publish = true,
	monochrome = true 
	)

public class Runner {

}
