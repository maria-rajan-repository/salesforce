package com.salesforcenew.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.ApplicationPage;
import com.salesforcenew.pageObjects.HomePage;
import com.salesforcenew.pageObjects.LeadsPage;
import com.salesforcenew.pageObjects.LoginPage;
import com.salesforcenew.pageObjects.NewContactsPage;
import com.salesforcenew.pageObjects.RandomScenariosPage;

public class RandonScenariosTests extends BaseClass {

	@Test(enabled = true)
	public void verifyFirstNameLastName33() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Verify First and Last name");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		RandomScenariosPage rsp = new RandomScenariosPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);

		// home tab
		rsp.getHomeTab().click();

		// handle popup
		ap.getLogx().click();

		rsp.getSave15().click();

	}

	@Test(enabled = true)
	public void verifyEditedLastName34() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Verify edited name");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		RandomScenariosPage rsp = new RandomScenariosPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);

		// home tab
		rsp.getHomeTab().click();
		// handle popup
		ap.getLogx().click();
		rsp.getSave15().click();
		// click on Edit
		rsp.getCliking().click();
		// switch to frame
		driver.switchTo().frame(rsp.getFrame11());
		rsp.getFrame12().click();

		// edit last name field

		WebElement lastNameNew = rsp.getLname();
		// driver.findElement(By.xpath("//input[@id='lastName']"));
		lastNameNew.clear();
		lastNameNew.sendKeys("Ant");
		rsp.getClick10().click();
		// driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
	}

	@Test(enabled = true)

	public void verifyTheTabCustoization35() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Verify tab customization");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		RandomScenariosPage rsp = new RandomScenariosPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on + tab
		Thread.sleep(2000);
		rsp.getClick3().click();
		// click 0n my customize tab
		rsp.getClick14().click();
		rsp.getClick15().click();
		rsp.getClick16().click();
		// save
		rsp.getClick17().click();

		// logout menu
		home.userMenu();
		home.logout();

		Thread.sleep(2000);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
	}

	@Test(enabled = true)
	public void blockingAnEvent36() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Block agent event");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		RandomScenariosPage rsp = new RandomScenariosPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);

		// home tab
		rsp.getHomeTab().click();
		// handle popup
		ap.getLogx().click();

		// click on the current date link
		rsp.getDat().click();
		// click on8:00am
		rsp.getTim().click();

		// click on subject como icon
		rsp.getAct().click();
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> itr = windowIDs.iterator();
		String parentID = itr.next();
		String childID = itr.next();
		// driver.findElement(By.xpath(""));
		driver.switchTo().window(childID);
		Thread.sleep(3000);
		// click on Other in the child window
		rsp.getAct1().click();
		driver.switchTo().window(parentID);
		// start time
		rsp.getStartTime().click();
		rsp.getTimPick().click();
		// end time
		rsp.getEndTime().click();
		Thread.sleep(2000);
		rsp.getTimpic().click();

		// end time 9:00pm
		// driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		// driver.findElement(By.xpath("//div[@id='timePickerItem_18']")).click();
		// save
		rsp.getSaveclik().click();
	}

	@Test(enabled = true)
	public void blockingEventWeeklyRecurrance37() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Weekly recurrance");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		HomePage home = new HomePage(driver);
		LeadsPage ledp = new LeadsPage(driver);
		NewContactsPage ncp = new NewContactsPage(driver);
		RandomScenariosPage rsp = new RandomScenariosPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		// click on application
		ap.getApplication().click();
		Thread.sleep(2000);
		// home tab
		rsp.getHomeTab().click();
		// handle popup
		ap.getLogx().click();
		// click on the current date link
		rsp.getDat().click();

		rsp.getTab13().click();

		// click on subject como icon
		rsp.getAct().click();

		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> itr = windowIDs.iterator();
		String parentID = itr.next();
		String childID = itr.next();

		driver.switchTo().window(childID);
		Thread.sleep(3000);
		// click on Other in the child window
		rsp.getClickChild().click();
		driver.switchTo().window(parentID);
		driver.switchTo().window(parentID);
		// start time
		rsp.getStartTime().click();
		rsp.getEndTim1().click();
		// end time
		rsp.getEndTime().click();
		Thread.sleep(2000);
		rsp.getTimpic().click();
		// check box Recurrence
		rsp.getRecur().click();
		// weekly radio button
		rsp.getRadio().click();
		// click on End date
		rsp.getRecuureEnd().click();
		// month dropDown
		Select monthDropDown = new Select(rsp.getSelet());
		monthDropDown.selectByVisibleText("February");

		// year dropdowm
		Select yearDropDown = new Select(rsp.getYearPic());
		yearDropDown.selectByVisibleText("2022");
		Thread.sleep(2000);

		String date = "15";
		// for date selection
		List<WebElement> dates = (List<WebElement>) rsp.getDatpic();
		for (WebElement alldates : dates) {
			String newDates = alldates.getText();
			// System.out.println(newDates);
			if (newDates.equals(date)) {
				alldates.click();
				break;
			}
		}
		// click on save

		rsp.getBbr().click();
		// driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		// click on month view
		rsp.getMthView().click();

	}
}
