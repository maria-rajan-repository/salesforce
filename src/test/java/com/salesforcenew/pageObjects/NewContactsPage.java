package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
public class NewContactsPage extends LoginPage{

	public NewContactsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Contacts']") WebElement cont;
	@FindBy(xpath = "//input[@title='New']") WebElement title;
	@FindBy(name = "name_lastcon2") WebElement namels;
	@FindBy(name = "con4") WebElement con4;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']" ) WebElement topButtonRow;
	@FindBy(xpath = "//a[normalize-space()='Create New View']") WebElement createnewview;
	@FindBy(xpath = "//input[@id='fname']") WebElement inpname;
	
	@FindBy(xpath = "//input[@id='devname']") WebElement inpDevName;
	@FindBy(name ="save" ) WebElement sav;
	@FindBy(xpath = "//select[@id='hotlist_mode']") WebElement hotlist;
	@FindBy(xpath = "//select[@id='fcf']") WebElement fcf;
	@FindBy(xpath = "//a[contains(text(),'JR')]") WebElement containtex;
	
	@FindBy(xpath = "//a[normalize-space()='Create New View']") WebElement newview;
	@FindBy(xpath = "//input[@id='devname']") WebElement nam;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement savbutton;
	
	@FindBy(xpath = "//input[@id='fname']") WebElement name10;
	@FindBy(xpath = "//input[@id='devname']") WebElement name11;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]" ) WebElement clikbutton;
	

	
	@FindBy(xpath = "//input[@title='New']") WebElement titnew;
	@FindBy(name = "name_lastcon2" ) WebElement name_lastcon2;
	
	@FindBy(name = "con4") WebElement namw13;
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save & New']") WebElement save12;
	
	
	
	
	
	public WebElement getName10() {
		return name10;
	}
	public WebElement getName11() {
		return name11;
	}
	public WebElement getClikbutton() {
		return clikbutton;
	}
	public WebElement getContaintex() {
		return containtex;
	}
	public WebElement getFcf() {
		return fcf;
	}
	public WebElement getHotlist() {
		return hotlist;
	}
	public WebElement getTitnew() {
		return titnew;
	}
	public WebElement getName_lastcon2() {
		return name_lastcon2;
	}
	public WebElement getNamw13() {
		return namw13;
	}
	public WebElement getSave12() {
		return save12;
	}
	public WebElement getNewview() {
		return newview;
	}
	public WebElement getNam() {
		return nam;
	}
	public WebElement getSavbutton() {
		return savbutton;
	}
	public WebElement getCreatenewview() {
		return createnewview;
	}
	public WebElement getInpname() {
		return inpname;
	}
	public WebElement getInpDevName() {
		return inpDevName;
	}
	public WebElement getSav() {
		return sav;
	}
	
	public WebElement getCont() {
		return cont;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getNamels() {
		return namels;
	}
	public WebElement getCon4() {
		return con4;
	}
	public WebElement getTopButtonRow() {
		return topButtonRow;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
