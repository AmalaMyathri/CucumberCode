package TestRunner;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/TestFeature/Dummy1.feature",
		glue= {"stepDefinition"},
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome= true
		)

public class TestRunner{
	
}
