package com.pages;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPage extends Utility  
{
	@FindBy(xpath="//*[@id=\"btnStep1\"]")
	WebElement nextButton;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='password']")
	WebElement password2;
	@FindBy(xpath="//*[@id='btnLogin']")
	WebElement login;
	@FindBy(xpath="/html")
	WebElement TextVisibility;
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
	} 
	

	public void wrongloginid(String WrongEmailid) {
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
	     Iterator<String> it = handles.iterator();
	      String parentpage = (String) it.next();
	      String childpage = (String) it.next();
	      driver.switchTo().window(childpage);
	      driver.findElement(By.xpath("//*[@id=\"emailOrMobile\"]")).sendKeys(WrongEmailid);
	}
	
	
	
	public void loginemailid() {
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
	     Iterator<String> it = handles.iterator();
	      String parentpage = (String) it.next();
	      String childpage = (String) it.next();
	      driver.switchTo().window(childpage);
	      driver.findElement(By.xpath("//*[@id=\"emailOrMobile\"]")).sendKeys("syedsuhana563@gmail.com");
	}
	
	
	public void NextButton() {
		nextButton.click();
	}
	

	public void loginPassword() {
		//password.click();
		password.sendKeys("Syedsuhana@22");
	}	
	
	
	public void wrongpassword(String password) {
		//password.click();
		password2.sendKeys(password);
	}	
	
	public void loginButton() throws IOException {
		login.click();
		//return new HomePage();
	}	
	
	
	public void uIscenerio() throws IOException {
		System.out.print(TextVisibility.getText());
		
	
	}	
	
	
	
public void captureScreenshot() throws Exception {
		
		Date currentDate = new Date();
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File binaryFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Make sure screenshots folder is already created at the project level
		File imageFile = new File(screenshotsPath + screenshotFileName + ".png"); 
		FileUtils.copyFile(binaryFile, imageFile);
	}


}
