package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility 
{
	
	@FindBy(xpath="//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[2]/a")
	WebElement login; 
	@FindBy(xpath="//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[2]/div/div[2]/a")
	WebElement button;
	

	
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	
	public  void clickLoginButton() throws IOException  //I have changed the return type to void
	{
		login.click();
		
		
	}
	
	
	public void clickingButton2() throws IOException {
		button.click();
		
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