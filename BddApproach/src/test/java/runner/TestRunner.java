package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\asus\\eclipse-workspace\\BddApproach\\src\\test\\java\\features\\Test.feature"
	,glue= {"stepdefinitions"},plugin={"pretty","html:target/cucumber/report.html"})
	public class TestRunner{
		
		

	}



