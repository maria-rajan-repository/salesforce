package com.salesforcenew.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class RandomScenariosPage extends LoginPage {

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//a[normalize-space()='Home']") WebElement homeTab; 
	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]") WebElement save15;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]") WebElement cliking;
	@FindBy(id = "contactInfoContentId") WebElement frame11;
	@FindBy(id = "aboutTab") WebElement frame12;
	
	@FindBy(xpath = "//input[@id='lastName']" ) WebElement lname;
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]") WebElement click10;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]") WebElement click14;
	@FindBy(xpath = "//option[contains(text(),'Assets')]") WebElement click15;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[3]/a[1]/img[1]") WebElement click16;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]") WebElement click17;
	@FindBy(xpath ="//*[@id=\"AllTab_Tab\"]/a/img" ) WebElement click3;
	
	
	@FindBy(xpath = "//a[normalize-space()='Wednesday February 9, 2022']") WebElement dat;
	@FindBy(xpath = "//a[contains(text(),'8:00 AM')]") WebElement tim;
	@FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]") WebElement act;
	@FindBy(xpath = "//body/div[2]/ul[1]/li[5]/a[1]") WebElement act1;

	@FindBy(xpath = "//input[@id='StartDateTime_time']") WebElement startTime;
	@FindBy(xpath = "//div[@id='timePickerItem_42']") WebElement timPick;
	
	@FindBy(xpath = "//input[@id='EndDateTime_time']") WebElement endTime;
	@FindBy(xpath = "//div[@id='timePickerItem_47']") WebElement timpic;
	


	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]") WebElement saveclik;
	@FindBy(xpath = "//div[@id='p:f:j_id25:j_id61:20:j_id64']") WebElement tab13;
	@FindBy(xpath = "//body/div[2]/ul[1]/li[5]/a[1]") WebElement clickChild;
	@FindBy(xpath ="//div[@id='timePickerItem_34']" ) WebElement endTim1;
	

	@FindBy(xpath ="//input[@id='IsRecurrence']" ) WebElement recur;
	
	@FindBy(xpath = "//input[@id='rectypeftw']") WebElement radio;
	
	@FindBy(xpath = "//input[@id='RecurrenceEndDateOnly']") WebElement recuureEnd;
	
	@FindBy(xpath ="//select[@id='calMonthPicker']" ) WebElement selet;
	
	@FindBy(xpath = "//div[@id='datePicker']//td") WebElement datpic;
	@FindBy(xpath = "//select[@id='calYearPicker']") WebElement yearPic;
	
	@FindBy(xpath = "//td[@id='bottomButtonRow']//input[@title='Save']") WebElement bbr;
	
	@FindBy(xpath = "//img[@title='Month View']" )WebElement mthView;
	
	

	public WebElement getBbr() {
		return bbr;
	}


	public WebElement getMthView() {
		return mthView;
	}


	public WebElement getYearPic() {
		return yearPic;
	}


	public WebElement getDatpic() {
		return datpic;
	}


	public WebElement getSelet() {
				return selet;
			}


	public WebElement getRecuureEnd() {
		return recuureEnd;
	}


	public WebElement getRadio() {
		return radio;
	}


	public WebElement getRecur() {
		return recur;
	}

	
	public WebElement getEndTim1() {
		return endTim1;
	}

	public WebElement getClickChild() {
		return clickChild;
	}

	public WebElement getTab13() {
		return tab13;
	}

	public WebElement getSaveclik() {
		return saveclik;
	}

	public WebElement getTimpic() {
		return timpic;
	}
	public WebElement getAct1() {
		return act1;
	}
	public WebElement getAct() {
		return act;
	}
	public WebElement getStartTime() {
		return startTime;
	}
	public WebElement getTimPick() {
		return timPick;
	}
	public WebElement getEndTime() {
		return endTime;
	}
	public WebElement getTim() {
		return tim;
	}
	public WebElement getDat() {
		return dat;
	}
	public WebElement getClick3() {
		return click3;
	}
	public WebElement getClick14() {
		return click14;
	}
	public WebElement getClick15() {
		return click15;
	}
	public WebElement getClick16() {
		return click16;
	}
	public WebElement getClick17() {
		return click17;
	}
	public WebElement getCliking() {
		return cliking;
	}
	public WebElement getFrame11() {
		return frame11;
	}
	public WebElement getFrame12() {
		return frame12;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getClick10() {
		return click10;
	}
	public WebElement getHomeTab() {
		return homeTab;
	}
	public WebElement getSave15() {
		return save15;
	}
	

	
	
	
	
	
	
	
}
