package com.salesforcenew.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.ApplicationPage;
import com.salesforcenew.pageObjects.LoginPage;

public class ApplicationTest extends BaseClass {
	@Test(enabled = true)
	public void createAnAccount10() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Create Account");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		ap.getAccounts().click();
		Thread.sleep(2000);
		// handle popup
		ap.getLogx().click();
		Thread.sleep(2000);
		ap.getAcc().sendKeys("MariaNew7");
		ap.getElement().click();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void createNewView11() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Create new view");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		ap.getAccounts().click();
		Thread.sleep(2000);
		// handle popup
		ap.getLogx().click();
		ap.getNewView().click();
		ap.getFname2().sendKeys("MariaAn");
		ap.getDevname().sendKeys("JefNi");
		ap.getSave().click();

	}

	@Test(enabled = true)
	public void editView12() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Edit view");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		ap.getAccounts().click();
		Thread.sleep(2000);
		// handle popup
		ap.getLogx().click();

		// click on view
		ap.getSelect().click();
		// click on edit
		Thread.sleep(2000);
		ap.getEdit().click();

		// first set of data
		ap.getData1().click();
		Thread.sleep(2000);
		ap.getData2().click();

		Thread.sleep(2000);
		ap.getName1().sendKeys("123");

		// second set of data
		Thread.sleep(2000);
		ap.getData3().click();
		ap.getData4().click();
		ap.getName2().sendKeys("321");

		// 3rd set of data
		Thread.sleep(2000);
		ap.getData5().click();
		ap.getData6().click();
		ap.getName3().sendKeys("231");

		// 4th set of data
		Thread.sleep(2000);
		ap.getData7().click();
		ap.getData8().click();
		ap.getName4().sendKeys("211");
		Thread.sleep(2000);
		// 5th set of data
		ap.getData9().click();
		ap.getData10().click();
		ap.getName5().sendKeys("221");

//		//click on avilable field

		ap.getField1().click();
		ap.getField2().click();

		ap.getButton3().click();
		ap.getButton4().click();

	}

	@Test(enabled = true)
	public void mergeAccounts13() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Merge account");

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		ap.getAccounts().click();
		Thread.sleep(2000);
		// handle popup
		ap.getLogx().click();
		// click on Merge Accounts
		ap.getMerge().click();
		Thread.sleep(2000);
		ap.getMerge1().sendKeys("Maria");
		Thread.sleep(2000);
		ap.getSrchbtn().click();
		ap.getTobbtn().click();
		// click on merge button
		ap.getMergeBtn().click();
		Thread.sleep(2000);
		// handling pop up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.getText();
		alert.accept();
	}

	@Test(enabled = true)
	public void createAccReport14() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Account reports");

		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		// click on application
		ap.getApplication().click();
		ap.getAccounts().click();
		Thread.sleep(2000);
		// handle popup
		ap.getLogx().click();
		// click on acc with last activity
		ap.getActivity().click();
		Thread.sleep(2000);
		System.out.println("The child window is:" + driver.getTitle());
		// handle pop up
		ap.getPopUp().click();
		Thread.sleep(2000);
		ap.getDate().click();
		ap.getField().click();
		Thread.sleep(2000);
		ap.getDatepicker().click();
		WebElement ele = ap.getEndDate();
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("2/22/2022");

		// click on save
		ap.getReprtBtn().click();
		ap.getDevname().sendKeys("maria");
		ap.getDevname().sendKeys("Jefni");
		Thread.sleep(2000);
		ap.getTable().click();

	}

}
