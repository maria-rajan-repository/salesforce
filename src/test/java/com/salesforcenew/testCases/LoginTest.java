package com.salesforcenew.testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.HomePage;
import com.salesforcenew.pageObjects.LoginPage;
import com.salesforcenew.utilities.Log;

///added for extendtest


public class LoginTest extends BaseClass {
	
	
	@Test(enabled=true)
	public void loginTest() throws IOException, InterruptedException {

		//added fr extend report 
		Log.startTestCase("loginTest");
		Log.info("user is going to click on SignIn");
		
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered password");
		Thread.sleep(1000);
		lp.clickSubmit();
		Thread.sleep(1000);

		if (driver.getTitle().equals("Home Page ~ Salesforce - Developer Edition")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, "LoginTest");//if the test case is failure, then the we need to call the screenshot
			Assert.assertTrue(false);
		}

		// tearDown();

	}
	
	@Test(enabled = false)
	public void loginErrorMessage() throws IOException {
		
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.clearPw();
		lp.clickSubmit();
		String actualErrorMessage = lp.actualErrorMessage();
		String ecpectedErrorMessage = "Please enter your password.";
		System.out.println(actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, ecpectedErrorMessage);

	}
	
	@Test(enabled = false)
	public void rememberMe() throws IOException, InterruptedException {

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home =new HomePage(driver);
		lp.setUserName(username);
		logger.info("username entered");
		lp.setPassword(password);
		
		logger.info("password entered");
		Thread.sleep(2000);
		
		lp.rememberMeButton();
		logger.info("rememberMe button clicked");
		
		lp.clickSubmit();
		logger.info("login button clicked");
				
		Thread.sleep(2000);
		WebElement dropDown = home.userMenu();
		dropDown.click();
		
		Thread.sleep(2000);
		logger.info("clicking dropdown");
		WebElement logout = home.logout();
		logout.click();

		//Actions act = new Actions(driver);
		//act.moveToElement(dropDown).moveToElement(logout).click().perform();
		
	}
	
	@Test(enabled = false)
	public void forgotPassword() throws IOException {

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("userName");
		lp.forgotPassword().click();
		//driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		logger.info("forgot password diplayed");
	}
	
	
	@Test(enabled = false)
	public void validateloginErrorMessage() throws IOException {
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		
		
		System.out.println(readcon.getDummyID());
		lp.setUserName(readcon.getDummyID());
		logger.info("Wrong username");
		
		lp.setPassword(readcon.getDummyPwd());
		logger.info("Wrong password");
		
		lp.clickSubmit();

	}
	
}
