package com.salesforcenew.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.salesforcenew.pageObjects.ApplicationPage;
import com.salesforcenew.pageObjects.HomePage;
import com.salesforcenew.pageObjects.LeadsPage;
import com.salesforcenew.pageObjects.LoginPage;

public class LeadsTests extends BaseClass{

@Test(enabled = false)
public void leadsTab20() throws IOException, InterruptedException {

	LoginPage lp = new LoginPage(driver);
	ApplicationPage ap = new ApplicationPage(driver);
	HomePage home = new HomePage(driver);
	LeadsPage ledp =new LeadsPage(driver);
	lp.setUserName(prop.getProperty("userName"));
	lp.setPassword(prop.getProperty("password"));
	lp.clickSubmit();
	//click on application
	ap.getApplication().click();
	Thread.sleep(2000);
	//click on leads
	
	ledp.getLeads().click();
	Thread.sleep(2000);
	//handle popup
	ap.getLogx().click();
	Thread.sleep(2000);
	//user menu for logOut
	home.userMenu().click();
	
	//logOut
	home.logout().click();
	
}
@Test(enabled = false)
public void leadsSelectView21() throws IOException, InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	ApplicationPage ap = new ApplicationPage(driver);
	HomePage home = new HomePage(driver);
	LeadsPage ledp =new LeadsPage(driver);
	lp.setUserName(prop.getProperty("userName"));
	lp.setPassword(prop.getProperty("password"));
	lp.clickSubmit();
	//click on application
	ap.getApplication().click();
	Thread.sleep(2000);
	//click on leads
	ledp.getLeads().click();
	Thread.sleep(2000);
	//handle popup
	ap.getLogx().click();
	Thread.sleep(2000);
	//click on view
	ledp.getView().click();
	//logOut
	Thread.sleep(2000);
	home.userMenu().click();
	home.logout().click();

}
@Test(enabled = false)
public void defaultView22() throws IOException, InterruptedException {

	LoginPage lp = new LoginPage(driver);
	ApplicationPage ap = new ApplicationPage(driver);
	HomePage home = new HomePage(driver);
	LeadsPage ledp =new LeadsPage(driver);
	lp.setUserName(prop.getProperty("userName"));
	lp.setPassword(prop.getProperty("password"));
	lp.clickSubmit();
	//click on application
	ap.getApplication().click();
	Thread.sleep(2000);
	//click on leads
	ledp.getLeads().click();
	Thread.sleep(2000);
	//handle popup
	ap.getLogx().click();
	Thread.sleep(2000);
	//logOut
	home.userMenu().click();
	home.logout().click();
	//click on view
	//driver.findElement(By.xpath("//select[@id='fcf']")).click();
	Thread.sleep(2000);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(2000);
	//click on application
	ap.getApplication().click();
	Thread.sleep(2000);
	ledp.getLeads().click();
	ledp.getToday().click();
	//click on Go
	ledp.getTodLead().click();
	
}
@Test(enabled = false)
public void todaysLeads23() throws IOException, InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	ApplicationPage ap = new ApplicationPage(driver);
	HomePage home = new HomePage(driver);
	LeadsPage ledp =new LeadsPage(driver);
	lp.setUserName(prop.getProperty("userName"));
	lp.setPassword(prop.getProperty("password"));
	lp.clickSubmit();
	//click on application
	ap.getApplication().click();
	Thread.sleep(2000);
	//click on leads
	ledp.getLeads().click();
	Thread.sleep(2000);
	//handle popup
	ap.getLogx().click();
	Thread.sleep(2000);
	
}
@Test(enabled = false)
public void newButton24() throws IOException, InterruptedException {
	
	LoginPage lp = new LoginPage(driver);
	ApplicationPage ap = new ApplicationPage(driver);
	HomePage home = new HomePage(driver);
	LeadsPage ledp =new LeadsPage(driver);
	lp.setUserName(prop.getProperty("userName"));
	lp.setPassword(prop.getProperty("password"));
	lp.clickSubmit();
	//click on application
	ap.getApplication().click();
	Thread.sleep(2000);
	//click on leads
	ledp.getLeads().click();
	Thread.sleep(2000);
	//handle popup
	ap.getLogx().click();
	Thread.sleep(2000);
	//new button
	ledp.getNewbuttom().click();
	ledp.getLastlead().sendKeys("ABCD");
	ledp.getLaedname().sendKeys("ABCD");
	ledp.getBotbuttonrow().click();
	
}



}
