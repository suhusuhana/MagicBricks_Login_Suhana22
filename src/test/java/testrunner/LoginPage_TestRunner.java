package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/resources/feature/login1.feature",
        glue= {"loginpage_stepdefinitions","com.apphooks"},
        plugin= {"pretty" ,
        "html:cucumber_report/positivecucumber.html",
        "json:cucumber_report/positivecucumber.json",
        "junit:cucumber_report/positivecucumber.xml"}
		)

public class LoginPage_TestRunner extends AbstractTestNGCucumberTests {
	
	
}


