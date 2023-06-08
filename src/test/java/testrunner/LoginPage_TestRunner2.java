package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/resources/feature/login2.feature",
        glue= {"loginpage_stepdefinitions_outline","com.apphooks"},
        plugin= {"pretty" ,
        "html:cucumber_report/negativecucumber.html",
        "json:cucumber_report/negativecucumber.json",
        "junit:cucumber_report/negativecucumber.xml"}
		)

public class LoginPage_TestRunner2 extends AbstractTestNGCucumberTests {
	
	
}

