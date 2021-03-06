package com.salesforcenew.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.ApplicationPage;
import com.salesforcenew.pageObjects.HomePage;
import com.salesforcenew.pageObjects.LeadsPage;
import com.salesforcenew.pageObjects.LoginPage;
import com.salesforcenew.pageObjects.NewContactsPage;

public class NewContactTests extends BaseClass {

	@Test(enabled = true)
	public void createNewContact25() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Create new contact");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();

		// driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		// handle popup
		ap.getLogx().click();
		Thread.sleep(2000);
		ncp.getTitle().click();
		ncp.getNamels().sendKeys("JR");
		ncp.getCon4().sendKeys("Maria");
		ncp.getTopButtonRow().click();

	}

	@Test(enabled = true)
	public void createNewView26() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Create new view");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		Thread.sleep(2000);
		// click create new view
		ncp.getCreatenewview().click();
		ncp.getInpname().sendKeys("Mam");
		Thread.sleep(2000);
		ncp.getInpDevName().sendKeys("JJ");
		ncp.getSav().click();

	}

	@Test(enabled = true)
	public void checkRecentlyCreatedContact27() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Chec recent contact");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		Thread.sleep(2000);
		// Recently created

		ncp.getHotlist().click();

	}

	@Test(enabled = true)
	public void myContacts28() throws IOException, InterruptedException {
		testCase = extendReport.createTest("My Contacts");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		// my contacts
		ncp.getFcf().click();

	}

	@Test(enabled = true)
	public void contactPage29() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Contacts page");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		// contact name
		ncp.getContaintex().click();
	}

	@Test(enabled = true)
	public void checkErrorMessege30() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Check error message");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		// click create new view
		ncp.getNewview().click();
		ncp.getNam().sendKeys("EFGH");
		Thread.sleep(2000);
		// sav
		ncp.getSavbutton().click();

	}

	@Test(enabled = true)
	public void checkCancelButton31() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Cancel button");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		// click create new view
		ncp.getNewview().click();
		Thread.sleep(2000);

		ncp.getName10().sendKeys("ABCD");
		ncp.getName11().sendKeys("EFGH");
		Thread.sleep(2000);
		ncp.getClikbutton().click();

	}

	@Test(enabled = true)
	public void checkSaveNewButton32() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Check save button");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// click on contact
		ncp.getCont().click();
		// handle popup
		ap.getLogx().click();
		// new button
		ncp.getTitnew().click();
		ncp.getName_lastcon2().sendKeys("Indian");
		Thread.sleep(2000);
		ncp.getNamw13().sendKeys("Global Media");
		Thread.sleep(2000);
		ncp.getSave12().click();

	}

}
