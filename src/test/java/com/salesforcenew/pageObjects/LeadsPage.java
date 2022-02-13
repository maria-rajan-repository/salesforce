package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends LoginPage {

	public LeadsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Leads']")
	WebElement leads;
	@FindBy(xpath = "//select[@id='fcf']")
	WebElement view;
	@FindBy(xpath = "//option[contains(text(),\"Today's Leads\")]")
	WebElement today;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")
	WebElement todLead;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]")
	WebElement newbuttom;

	@FindBy(name = "name_lastlea2")
	WebElement lastlead;

	@FindBy(name = "lea3")
	WebElement laedname;
	@FindBy(xpath = "//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement botbuttonrow;

	public WebElement getNewbuttom() {
		return newbuttom;
	}

	public WebElement getLastlead() {
		return lastlead;
	}

	public WebElement getLaedname() {
		return laedname;
	}

	public WebElement getBotbuttonrow() {
		return botbuttonrow;
	}

	public WebElement getToday() {
		return today;
	}

	public WebElement getTodLead() {
		return todLead;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getView() {
		return view;
	}

}
