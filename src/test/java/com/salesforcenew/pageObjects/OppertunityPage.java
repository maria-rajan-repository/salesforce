package com.salesforcenew.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class OppertunityPage extends LoginPage {

	public OppertunityPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='fcf']") WebElement opp;
	@FindBy(xpath = "//input[@title='New']" ) WebElement new1;
	@FindBy(xpath = "//input[@id='opp3']") WebElement opp3;
	@FindBy(xpath = "//input[@id='opp4']") WebElement opp4;
	@FindBy(xpath = "//input[@id='opp9']") WebElement ele1;
	@FindBy(xpath = "//select[@id='opp11']") WebElement opp11;
	@FindBy(xpath = "//*[@id=\"opp12\"]") WebElement opp12;
	@FindBy(xpath = "//select[@id='opp6']") WebElement opp6;
	@FindBy(xpath = "//input[@id='opp17']") WebElement opp17;
	@FindBy(xpath = "//td[@id='bottomButtonRow']//input[@title='Save']") WebElement botRow;
	@FindBy(xpath = "//li[@id='Opportunity_Tab']") WebElement oppor;
	@FindBy(xpath = "//a[normalize-space()='Opportunity Pipeline']") WebElement OpportunityPipeline;
	@FindBy(xpath = "//a[normalize-space()='Stuck Opportunities']") WebElement StuckOpportunities;
	@FindBy(xpath = "//h3[normalize-space()='Quarterly Summary']") WebElement Quarterly_Summary;
	@FindBy(xpath = "//select[@id='quarter_q']") WebElement quarter_q;
	@FindBy(xpath = "//select[@id='open']") WebElement c19_open;
	
	
	
	
	public WebElement getC19_open() {
		return c19_open;
	}

	public WebElement getQuarterly_Summary() {
		return Quarterly_Summary;
	}

	public WebElement getQuarter_q() {
		return quarter_q;
	}

	public WebElement getStuckOpportunities() {
		return StuckOpportunities;
	}

	public WebElement getOpportunityPipeline() {
		return OpportunityPipeline;
	}

	public WebElement getOppor() {
		return oppor;
	}

	public WebElement getOpp11() {
		return opp11;
	}

	public WebElement getOpp12() {
		return opp12;
	}

	public WebElement getOpp6() {
		return opp6;
	}

	public WebElement getOpp17() {
		return opp17;
	}

	public WebElement getBotRow() {
		return botRow;
	}

	public WebElement getEle1() {
		return ele1;
	}

	public WebElement getOpp3() {
		return opp3;
	}

	public WebElement getOpp4() {
		return opp4;
	}

	public WebElement getNew1() {
		return new1;
	}

	public WebElement getOpp() {
		return opp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
