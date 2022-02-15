package stepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:Feature",
		glue = "stepDef",
		tags = "@smoke", 
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {
				"pretty", 
				"html:target/HTMLReport/Report.html",
				"json:target/JsonReport/Report.json" }, 
		publish = true

)




public class TestRunner {

}
