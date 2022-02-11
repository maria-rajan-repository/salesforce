package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalPage extends LoginPage{
	
	
	public PersonalPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "PersonalInfo_font") WebElement PersonalInfo;
	@FindBy(id = "LoginHistory_font") WebElement LoginHistory;
	@FindBy(xpath = "//a[contains(text(),'Download login history for last six months, includ')]\r\n") WebElement RelatedUserLoginHistoryList;
	@FindBy(xpath = "//*[@id=\"DisplayAndLayout\"]/a") WebElement DisplayAndLayout;
	@FindBy(xpath = "//*[@id=\"CustomizeTabs_font\"]") WebElement CustomizeTabs;
	@FindBy(xpath = "//*[@id=\"p4\"]") WebElement p4;
	@FindBy(xpath = "//option[contains(text(),'Salesforce Chatter')]") WebElement SalesforceChatter;
	@FindBy(id = "duel_select_0") WebElement duel_select;
	@FindBy(xpath = "//option[@value='report']") WebElement option;
	@FindBy(xpath = "//img[@title='Add']") WebElement add;
	@FindBy(xpath = "//input[@title='Save']") WebElement input;
	@FindBy(xpath = "//li[@id='report_Tab']") WebElement report;
	@FindBy(xpath = "//*[contains(@id,'tsidLabel')]" ) WebElement label;
	@FindBy(xpath ="//a[normalize-space()='Reports']") WebElement reports;
	@FindBy(xpath = "//li[@id='report_Tab']") WebElement tab;
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[4]/div[6]/a[1]") WebElement cal;
	@FindBy(xpath = "//a[contains(text(),'Developer Console')]") WebElement devConsole;
	
	
	public WebElement getDevConsole() {
		return devConsole;
	}
	public WebElement getCal() {
		return cal;
	}
	public WebElement getRemin() {
		return remin;
	}


	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[4]/div[6]/div[1]/div[2]") WebElement remin;
	public WebElement getTab() {
		return tab;
	}
	public WebElement getReports() {
		return reports;
	}
	public WebElement getLabel() {
		return label;
	}
	public WebElement getReport() {
		return report;
	}
	public WebElement getOption() {
		return option;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getInput() {
		return input;
	}
	public WebElement getPersonalInfo() {
		return PersonalInfo;
	}
	public WebElement getLoginHistory() {
		return LoginHistory;
	}
	public WebElement getRelatedUserLoginHistoryList() {
		return RelatedUserLoginHistoryList;
	}
	public WebElement getDisplayAndLayout() {
		return DisplayAndLayout;
	}
	public WebElement getCustomizeTabs() {
		return CustomizeTabs;
	}
	public WebElement getP4() {
		return p4;
	}
	public WebElement getSalesforceChatter() {
		return SalesforceChatter;
	}
	public WebElement getDuel_select() {
		return duel_select;
	}
	
	
	 
	
	
	
	
	
	
}
