package com.salesforcenew.testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.HomePage;
import com.salesforcenew.pageObjects.LoginPage;



public class LoginTest extends BaseClass {

	@Test(enabled = true, priority=10)
	public void loginTest() throws IOException, InterruptedException {
		
		testCase = extendReport.createTest("Login page test"); 
		
		testCase.info("Login page test started");
		logger.assertLog(true, "Logger - login test started");
		
		
		
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
			captureScreen(driver, "LoginTest");// if the test case is failure, then the we need to call the screenshot
			Assert.assertTrue(false);
		}

		
		infoLogger("LoginTest - Run completed");
		

	}

	@Test(enabled = true, priority=20)
	public void loginErrorMessage() throws IOException {
		testCase = extendReport.createTest("Login error test");

		logger.info("URL is opened");
		testCase.info("Login error message started");
		
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.clearPw();
		lp.clickSubmit();
		String actualErrorMessage = lp.actualErrorMessage();
		String ecpectedErrorMessage = "Please enter your password.";
		System.out.println(actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, ecpectedErrorMessage);

	}

	@Test(enabled = true, priority=30)
	public void rememberMe() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Remember me checkbox");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home = new HomePage(driver);
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

	}

	@Test(enabled = true, priority=40)
	public void forgotPassword() throws IOException {
		testCase = extendReport.createTest("Forgot password");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("userName");
		lp.forgotPassword().click();
		// driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		logger.info("forgot password diplayed");
	}

	@Test(enabled = true, priority=50)
	public void validateloginErrorMessage() throws IOException {
		testCase = extendReport.createTest("Login error message");

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
