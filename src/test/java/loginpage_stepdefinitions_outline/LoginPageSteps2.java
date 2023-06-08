package loginpage_stepdefinitions_outline;
	import static org.testng.Assert.assertEquals;
	import java.io.IOException;

	import com.pages.HomePage;
	import com.pages.LandingPage;
	import com.pages.LoginPage;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.And;
	public class LoginPageSteps2 {
		
	    static final String EmailId = null;
		public LandingPage ldp;
		public LoginPage lp;
		
		public void objectMethod() throws IOException
		{
		
			ldp = new LandingPage();
			lp = new LoginPage();
			
		}

		
		@Given("Chrome is opened and MagicBricksApp is launched")
		public void chrome_is_opened_and_MagicBricksApp_is_launched() throws Exception
		{
			objectMethod();
			Thread.sleep(5000);
			lp.captureScreenshot();
			String actualTitle = ldp.validateLandinPageTitle();
			System.out.println(actualTitle);
			System.out.println("******************chrome_is_opened_and_MagicBricksApp_is_launched**************");
			Thread.sleep(3000);
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
		}
		
		 @Then("User Navigates to Login Page")
		    public void user_navigates_to_Login_Page() throws Exception
		   
		    {
		    	objectMethod();
		    	System.out.println("******************User IS ON LOGIN PAGE***************");
		    	Thread.sleep(2000);
		    	
		    }
	 @When("User enters correct EmailId")
	    public void user_enters_correct_email_id() throws IOException, InterruptedException {
	    	objectMethod();
	    	Thread.sleep(8000);
	    	lp.loginemailid();
	    	Thread.sleep(2000); 
	    	lp.NextButton();
	    	Thread.sleep(1000);
	    	lp.loginPassword();
	    	Thread.sleep(2000);
	    
	    }
	@Then("User enters incorrect Password {string}")
	public void user_enters_correct_password(String passowrd) throws IOException, InterruptedException {
	        objectMethod();
	    	Thread.sleep(8000);
	    	lp.wrongpassword(passowrd);
	    	Thread.sleep(2000);
	}
	@Then("User clicks on Login Button")
	public void User_clicks_on_login_button() throws IOException, InterruptedException {
	   	objectMethod();
	   	lp.loginButton();
	   	Thread.sleep(5000);
	}
	
	@Then("User enters incorrect Emailid {string}")
	public void user_enters_incorrect_emailid(String WrongEmailid) {
		lp.wrongloginid(WrongEmailid);
	}
	
	@Then("User gets error message")
	public void user_gets_error_message() {
		
	   System.out.println("*********USER IS NOT LOGGED IN*********");
	}
	
	}