package runner;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;



@CucumberOptions(
		plugin= { "json-pretty:target/cucmber-report.json", "preety" , "html:target/cucumber-htmlreport"},
		features = "src/resources/features/",
		glue= "steps",
		tags= ("@calculation")
		)


public class RunCuke extends AbstractTestNGCucumberTests {

	
	
	
}
