package loginpage_stepdefinitions_excel;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import com.utility.Config;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

//import com.aventstack.extentreports.configuration.Config;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginPageSteps_excel {
	private static final String EmailId = null;
	public LandingPage ldp;
	public LoginPage lp;
	ExcelReader reader;
	
	public void objectMethod() throws IOException
	{
	
		ldp = new LandingPage();
		lp = new LoginPage();
		
	}
	
	
	@Given("Chrome is opened and MagicBricksApp is launched")
	public void chrome_is_opened_and_magic_bricks_app_is_launched() throws Exception {
		objectMethod();
		Thread.sleep(5000);
		lp.captureScreenshot();
		String actualTitle = ldp.validateLandinPageTitle();
		System.out.println(actualTitle);
		System.out.println("******************chrome_is_opened_and_MagicBricksApp_is_launched**************");
		Thread.sleep(3000);
		
	    
	}
	@Then("User navigates on Landing Page")
	public void user_navigates_on_landing_page() throws IOException {
		objectMethod();
		String actualTitle = ldp.validateLandinPageTitle();
		String expectedTitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		assertEquals(actualTitle,expectedTitle);
		System.out.println("******************User navigates on Landing Page**************");
		System.out.println(actualTitle);
	   
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		ldp.clickLoginButton();
		Thread.sleep(2000);
		ldp.clickingButton2();
		System.out.println("******************user_clicks_on_login_button()**************");
		Thread.sleep(3000);
	    
	}
	@Then("User Navigates to Login Page")
	public void user_navigates_to_login_page() throws IOException, InterruptedException {
		objectMethod();
    	System.out.println("******************User IS ON LOGIN PAGE***************");
    	Thread.sleep(2000);
		
	}
	
	@Then("User enters correct Emailid and password from sheetname {string} and rownumber {int}")
	public void user_enters_correct_emailid_and_password_from_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InterruptedException, InvalidFormatException {
		objectMethod();

        Thread.sleep(1000);

        reader = new ExcelReader();

        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);

        String str = testData.get(rowNumber).get("name");

        lp.loginemailid();
        
        lp.NextButton();
        
        lp.wrongpassword(str);
        
        lp.loginButton();

        Thread.sleep(2000);
	   
	}
	

	@Then("User gets message your loggedin")
	public void user_gets_message_your_loggedin() throws Exception {
		objectMethod();
		lp.captureScreenshot();
		Thread.sleep(2000);
	    
	}
	}
