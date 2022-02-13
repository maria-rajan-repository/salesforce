package com.salesforcenew.testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.ApplicationPage;
import com.salesforcenew.pageObjects.LoginPage;
import com.salesforcenew.pageObjects.OppertunityPage;

public class OppertunityTest extends BaseClass {

	@Test(enabled = true)

	public void opprtunity15() throws InterruptedException {
		testCase = extendReport.createTest("Opportunity");

		LoginPage lp = new LoginPage(driver);
		OppertunityPage op = new OppertunityPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		ap.getApplication().click();
		Thread.sleep(2000);
		// click on opportunity
		op.getOppor().click();
		// popup
		ap.getLogx().click();
		Thread.sleep(2000);
		op.getOpp().click();
	}

	@Test(enabled = true)
	public void createNewOpty16() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Create new opportunity");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		OppertunityPage op = new OppertunityPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		ap.getApplication().click();
		Thread.sleep(2000);
		// opportunities
		op.getOppor().click();
		// popup
		ap.getLogx().click();
		Thread.sleep(2000);
		op.getOpp().click();
		Thread.sleep(2000);

		op.getNew1().click();

		// New Opportunity Edit page is displayed.
		// Enter Opportunity Name,Account Name,Close Date,Stage,Probability,Lead Source
		// ,
		// Primary Campaign Source and click on save button.

		op.getOpp3().sendKeys("New test Opp 01 ");
		// driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("New test Opp 01
		// ");

		op.getOpp4().sendKeys("MariaNew");
		// driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys("MariaNew");

		WebElement ele = op.getEle1();
		Thread.sleep(2000);

		op.getOpp11().click();
		op.getOpp12().click();
		op.getOpp6().click();
		op.getOpp17().click();
		op.getBotRow().click();

	}

	@Test(enabled = true)
	public void testOppPipeLine17() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Check pipeline");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		OppertunityPage op = new OppertunityPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		ap.getApplication().click();
		Thread.sleep(2000);

		// opportunities
		op.getOppor().click();
		Thread.sleep(2000);

		// popup
		ap.getLogx().click();
		Thread.sleep(2000);
		op.getOpp().click();
		Thread.sleep(2000);

		// opp pipeline
		op.getOpportunityPipeline().click();
	}

	@Test(enabled = true)
	public void testStuckOppReport18() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Check struck opportunity");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		OppertunityPage op = new OppertunityPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		ap.getApplication().click();
		Thread.sleep(2000);

		// opportunities
		op.getOppor().click();
		Thread.sleep(2000);

		// popup
		ap.getLogx().click();
		Thread.sleep(2000);

		op.getStuckOpportunities().click();
	}

	@Test(enabled = true)
	public void testQuarterlySummaryReport19() throws IOException, InterruptedException {
		testCase = extendReport.createTest("Quarterly summary report");

		LoginPage lp = new LoginPage(driver);
		ApplicationPage ap = new ApplicationPage(driver);
		OppertunityPage op = new OppertunityPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		ap.getApplication().click();
		Thread.sleep(2000);

		// opportunities
		op.getOppor().click();
		Thread.sleep(2000);

		// popup
		ap.getLogx().click();
		Thread.sleep(2000);

		// Click on Quarterly Summary link and
		// choose list of values for Interval such as Current FQ,Next FQ
		// and Include such as All,Open or closed Opportunities

		op.getQuarterly_Summary().click();
		WebElement dropDown = op.getQuarter_q();
		dropDown.click();

		Select sel = new Select(dropDown);
		List<WebElement> allOption = sel.getOptions();

		for (WebElement e : allOption) {
			System.out.println(e.getText());
		}

		op.getC19_open().click();

	}

}
