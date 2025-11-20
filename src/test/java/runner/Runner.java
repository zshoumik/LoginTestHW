package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {
	@CucumberOptions(
		features = "./src/main/resources/Login.feature",
		glue = "stepdefinition",
		plugin = {"json:target/cucumber-reports/cucumber.json"},
		//tags = "@SmokeTest",
		monochrome = true
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() {
			return super.scenarios();
		}
	}
}
