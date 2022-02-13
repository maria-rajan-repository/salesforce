package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationPage extends LoginPage {

	public ApplicationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@id='MoreTabs_Tab']")
	WebElement application;
	@FindBy(xpath = "//a[contains(text(),'Accounts')]")
	WebElement accounts;
	@FindBy(xpath = "//*[@id=\"tryLexDialogX\"]")
	WebElement logx;
	@FindBy(name = "new")
	WebElement new1;
	@FindBy(xpath = "//input[@id='acc2']")
	WebElement acc;
	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement element;

	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	WebElement newView;
	@FindBy(xpath = "//input[@id='fname']")
	WebElement fname2;
	@FindBy(xpath = "//input[@id='devname']")
	WebElement devname;
	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement save;
	@FindBy(xpath = "//select[@id='fcf']")
	WebElement select;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[1]")
	WebElement edit;
	@FindBy(xpath = "//tbody/tr[@id='frow1']/td[2]/select[1]/option[2]")
	WebElement data1;
	@FindBy(xpath = "//tbody/tr[@id='frow1']/td[3]/select[1]/option[4]")
	WebElement data2;
	@FindBy(xpath = "//input[@id='fval1']")
	WebElement name1;
	@FindBy(xpath = "//tbody/tr[@id='frow2']/td[2]/select[1]/option[2]")
	WebElement data3;
	@FindBy(xpath = "//tbody/tr[@id='frow2']/td[3]/select[1]/option[4]")
	WebElement data4;
	@FindBy(xpath = "//input[@id='fval2']")
	WebElement name2;

	@FindBy(xpath = "//tbody/tr[@id='frow3']/td[2]/select[1]/option[2]")
	WebElement data5;
	@FindBy(xpath = "//tbody/tr[@id='frow3']/td[3]/select[1]/option[4]")
	WebElement data6;
	@FindBy(xpath = "//input[@id='fval3']")
	WebElement name3;

	@FindBy(xpath = "//tbody/tr[@id='frow4']/td[2]/select[1]/option[2]")
	WebElement data7;
	@FindBy(xpath = "//tbody/tr[@id='frow3']/td[3]/select[1]/option[4]")
	WebElement data8;
	@FindBy(xpath = "//input[@id='fval3']")
	WebElement name4;

	@FindBy(xpath = "//tbody/tr[@id='frow5']/td[2]/select[1]/option[2]")
	WebElement data9;
	@FindBy(xpath = "//tbody/tr[@id='frow5']/td[3]/select[1]/option[4]")
	WebElement data10;
	@FindBy(xpath = "//input[@id='fval5']")
	WebElement name5;

	@FindBy(xpath = "//select[@id='colselector_select_0']")
	WebElement field1;
	@FindBy(xpath = "//tbody/tr[1]/td[1]/select[1]/option[35]")
	WebElement field2;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/a[1]/img[1]")
	WebElement button3;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement button4;

	@FindBy(xpath = "//a[contains(text(),'Merge Accounts')]")
	WebElement merge;
	@FindBy(xpath = "//*[@id=\"srch\"]")
	WebElement merge1;
	@FindBy(xpath = "//input[@name='srchbutton']")
	WebElement srchbtn;
	@FindBy(xpath = "//div[@class='pbTopButtons']//input[@title='Next']")
	WebElement tobbtn;
	@FindBy(xpath = "//input[@name='save']")
	WebElement mergeBtn;

	@FindBy(xpath = "//a[contains(text(),'Accounts with last activity > 30 days')]")
	WebElement activity;
	@FindBy(xpath = "//img[@id='ext-gen152']")
	WebElement popUp;
	@FindBy(xpath = "//body[1]/div[16]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]")
	WebElement date;
	@FindBy(xpath = "//*[@id=\"ext-gen281\"]")
	WebElement field;
	@FindBy(xpath = "//button[@id='ext-gen276']")
	WebElement datepicker;
	@FindBy(name = "endDate")
	WebElement endDate;

	@FindBy(xpath = "//*[@id=\"saveReportBtn\"]/tbody/tr[2]/td[2]")
	WebElement reprtBtn;
	@FindBy(xpath = "//input[@id='saveReportDlg_reportNameField']")
	WebElement reprtName;
	@FindBy(xpath = "//input[@id='saveReportDlg_DeveloperName']")
	WebElement reprtDevName;
	@FindBy(xpath = "//table[@id='dlgSaveAndRun']")
	WebElement table;

	public WebElement getReprtBtn() {
		return reprtBtn;
	}

	public WebElement getReprtName() {
		return reprtName;
	}

	public WebElement getReprtDevName() {
		return reprtDevName;
	}

	public WebElement getTable() {
		return table;
	}

	public WebElement getDatepicker() {
		return datepicker;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getField() {
		return field;
	}

	public WebElement getPopUp() {
		return popUp;
	}

	public WebElement getActivity() {
		return activity;
	}

	public WebElement getMergeBtn() {
		return mergeBtn;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

	public WebElement getTobbtn() {
		return tobbtn;
	}

	public WebElement getMerge() {
		return merge;
	}

	public WebElement getMerge1() {
		return merge1;
	}

	public WebElement getField1() {
		return field1;
	}

	public WebElement getField2() {
		return field2;
	}

	public WebElement getButton3() {
		return button3;
	}

	public WebElement getButton4() {
		return button4;
	}

	public WebElement getData9() {
		return data9;
	}

	public WebElement getData10() {
		return data10;
	}

	public WebElement getName5() {
		return name5;
	}

	public WebElement getData5() {
		return data5;
	}

	public WebElement getData6() {
		return data6;
	}

	public WebElement getName3() {
		return name3;
	}

	public WebElement getData7() {
		return data7;
	}

	public WebElement getData8() {
		return data8;
	}

	public WebElement getName4() {
		return name4;
	}

	public WebElement getData1() {
		return data1;
	}

	public WebElement getData2() {
		return data2;
	}

	public WebElement getName1() {
		return name1;
	}

	public WebElement getData3() {
		return data3;
	}

	public WebElement getData4() {
		return data4;
	}

	public WebElement getName2() {
		return name2;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getNewView() {
		return newView;
	}

	public WebElement getFname2() {
		return fname2;
	}

	public WebElement getDevname() {
		return devname;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getAcc() {
		return acc;
	}

	public WebElement getElement() {
		return element;
	}

	public WebElement getLogx() {
		return logx;
	}

	public WebElement getNew1() {
		return new1;
	}

	public WebElement getAccounts() {
		return accounts;
	}

	public WebElement getApplication() {
		return application;
	}

}
