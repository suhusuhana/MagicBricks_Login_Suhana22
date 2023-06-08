package loginpage_stepdefinitions;


import static org.testng.Assert.assertEquals;
import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginPageSteps extends Utility{
	
	public LandingPage ldp;
	public LoginPage lp;

	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		
	}
	
	@Given("Chrome is opened and MagicBricksApp is launched")
	public void chrome_is_opened_and_MagicBricksApp_is_launched() throws Exception
	{
		objectMethod();
		Thread.sleep(5000);
		logger = report.createTest("test01");
        logger.log(Status.INFO, "Validating landing page title");
        String actualTitle = ldp.validateLandinPageTitle();
        String expectedTitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
        try {
            assertEquals(expectedTitle,actualTitle);
            logger.log(Status.PASS, "Step1 is passed");
            System.out.println(actualTitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step1 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
//		lp.captureScreenshot();
//		String actualTitle = ldp.validateLandinPageTitle();
//		System.out.println(actualTitle);
//		System.out.println("******************chrome_is_opened_and_MagicBricksApp_is_launched**************");
//		Thread.sleep(3000);
	}
	
	@Then("User navigates on Landing Page")
	public void user_navigates_on_Landing_Page() throws InterruptedException, IOException
	{
		objectMethod();
		String actualTitle = ldp.validateLandinPageTitle();
		String expectedTitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
		assertEquals(actualTitle,expectedTitle);
		System.out.println("******************User navigates on Landing Page**************");
		System.out.println(actualTitle);
		logger.log(Status.PASS, "Step2 is passed");
	}
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException, IOException
	{
		objectMethod();
		ldp.clickLoginButton();
		Thread.sleep(2000);
		ldp.clickingButton2();
		System.out.println("******************user_clicks_on_login_button()**************");
		Thread.sleep(3000);
		logger.log(Status.PASS, "Step3 is passed");
	}
	
	 @Then("User Navigates to Login Page")
	    public void user_navigates_to_Login_Page() throws Exception
	   
	    {
	    	objectMethod();
	    	System.out.println("******************User IS ON LOGIN PAGE***************");
	    	Thread.sleep(2000);
	    	logger.log(Status.PASS, "Step4 is passed");
	    	
	    }

	@And("elements are enabled on Login Page")
    public void elements_are_enabled_on_Login_Page() throws InterruptedException, IOException
    {
    	objectMethod();
    	lp.uIscenerio();
    	Thread.sleep(3000);
    	System.out.println("******************ALL TEXT ON LOGIN PAGE ***************");
    	logger.log(Status.PASS, "Step5 is passed");
    	
    }
   
   
    @When("User enters correct EmailId")
    public void user_enters_correct_email_id() throws IOException, InterruptedException {
    	objectMethod();
    	Thread.sleep(8000);
    	lp.loginemailid();
    	Thread.sleep(2000); 
    	lp.NextButton();
    	Thread.sleep(2000);
    	logger.log(Status.PASS, "Step6 is passed");
    }
    @Then("User enters correct Password")
    public void user_enters_correct_password() throws InterruptedException, IOException {
    	objectMethod();
    	Thread.sleep(8000);
    	lp.loginPassword();
    	Thread.sleep(2000);
    	logger.log(Status.PASS, "Step7 is passed");
 
    }
    @And("User clicks on Login Button")
    public void user_clicks_on_Login_Button() throws InterruptedException, IOException
    {
   	objectMethod();
   	lp.loginButton();
   	Thread.sleep(5000);
   	logger.log(Status.PASS, "Step8 is passed");
    }
    @Then("User shows on Home Page")
    public void user_shows_on_home_page() throws IOException, InterruptedException {
    	objectMethod();
//    	Thread.sleep(2000);
//    	String actualtitle = lp.validateLoginPageTitle();
//    	String expectedtitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
//    	Thread.sleep(2000);
//    	assertEquals(expectedtitle, actualtitle);
    	logger = report.createTest("test01");
        logger.log(Status.INFO, "step9 is passed");
        String actualTitle = ldp.validateLandinPageTitle();
        String expectedTitle = "Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks";
        try {
            assertEquals(expectedTitle,actualTitle);
            logger.log(Status.PASS, "Step9 is passed");
            System.out.println(actualTitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step9 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
        
    }
}
    