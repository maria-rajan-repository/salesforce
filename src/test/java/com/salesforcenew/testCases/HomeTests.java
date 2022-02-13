package com.salesforcenew.testCases;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.ContactPage;
import com.salesforcenew.pageObjects.HomePage;
import com.salesforcenew.pageObjects.LoginPage;
import com.salesforcenew.pageObjects.PersonalPage;

public class HomeTests extends BaseClass {

	@Test(enabled = true)
	public void userMenuDropDown5() throws IOException, InterruptedException {
		testCase = extendReport.createTest("User menu drop-down");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		home.userMenu().click();
		logger.info("dropdown diplayed");

	}

	@Test(enabled = true)
	public void handleMyProfile6() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Handle my Profile");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ContactPage cp = new ContactPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		home.userMenu().click();
		logger.info("dropdown diplayed");
		home.getMyProfile().click();
		Thread.sleep(2000);
		cp.getEdit().click();
		logger.info("clicked edit profile");
		// switch to frame
		driver.switchTo().frame(cp.getFrame1());

		Thread.sleep(2000);
		cp.getAbout().click();

		// giving lastName
		cp.getLastName().sendKeys("JR Test");
		cp.getSaveButton().click();
		logger.info("lastname changed");

		driver.switchTo().parentFrame();
		// click on post tab
		cp.getPostTab().click();
		driver.switchTo().frame(cp.getFrame());

		Thread.sleep(2000);

		cp.getText().sendKeys("Hello World");

		driver.switchTo().parentFrame();

		cp.getSharebutton().click();

		// click on file tab
		Thread.sleep(2000);
		cp.getFile().click();
		cp.getOpenButton().click();

		Thread.sleep(2000);
		// file upload

		cp.getUpload().sendKeys(readcon.getdummyPath());
		cp.getSharebutton().click();

	}

	@Test(enabled = true)
	public void mySettings7() throws InterruptedException, IOException {
		testCase = extendReport.createTest("Settings");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		// ContactPage cp = new ContactPage(driver);
		PersonalPage pp = new PersonalPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		home.userMenu().click();
		logger.info("dropdown diplayed");
		Thread.sleep(2000);
		// click on my settings
		// WebElement myProfile = driver.findElement(By.linkText("My Settings"));
		home.getMySettings().click();
		Thread.sleep(2000);
		// click on Personal Link, Login History, Download file in the format of csv
		pp.getPersonalInfo().click();
		pp.getLoginHistory().click();
		pp.getRelatedUserLoginHistoryList().click();
		// click on display
		Thread.sleep(2000);
		pp.getDisplayAndLayout().click();
		pp.getCustomizeTabs().click();
		pp.getP4().click();
		Thread.sleep(2000);
		pp.getSalesforceChatter().click();
		pp.getDuel_select().click();
		Thread.sleep(2000);
		// click on report
		pp.getOption().click();
		pp.getAdd().click();
		pp.getInput().click();
		WebElement report = pp.getReport();
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(2000);

		// WebElement report = driver.findElement(By.xpath("//li[@id='report_Tab']"));
		Assert.assertTrue(report.isDisplayed());
		// click on marketing tab
		Thread.sleep(2000);

		pp.getLabel().click();

		// driver.findElement(By.xpath("//*[contains(@id,'tsidLabel')]")).click();

		Thread.sleep(2000);

		WebElement reportSalesPage = pp.getReports();
		Assert.assertTrue(reportSalesPage.isDisplayed());

		// click on marketing/salesforce chatter

		pp.getLabel().click();

		WebElement reportsfC = pp.getTab();
		Assert.assertTrue(reportsfC.isDisplayed());

		// click on calender & remainders
		Thread.sleep(2000);
		pp.getCal().click();
		pp.getRemin().click();
		// driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/div[6]/a[1]")).click();
		// driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/div[6]/div[1]/div[2]")).click();
	}

	@Test(enabled = true)
	public void developersConsole8() throws IOException, InterruptedException {

		testCase = extendReport.createTest("Developer console");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		PersonalPage pp = new PersonalPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on Edit profile
		home.userMenu().click();
		logger.info("dropdown diplayed");
		Thread.sleep(2000);
		// click on developers console
		pp.getDevConsole().click();

		Set<String> ss = driver.getWindowHandles();

		for (String i : ss) {
			String titles = driver.switchTo().window(i).getTitle();
			System.out.println(titles);
		}

		driver.close();
	}

	@Test(enabled = true)
	public void handleLogOut9() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Handle Logout");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		PersonalPage pp = new PersonalPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on Edit profile
		home.userMenu().click();
		logger.info("dropdown diplayed");
		Thread.sleep(2000);
		// click on logout
		home.logout().click();
		// driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}

}
