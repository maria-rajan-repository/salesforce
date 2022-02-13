package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends LoginPage {

	public ContactPage(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	WebElement edit;

	@FindBy(xpath = "//a[normalize-space()='About']")
	WebElement about;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(xpath = "//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
	WebElement saveButton;

	@FindBy(id = "contactInfoContentId")
	WebElement frame1;

	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement frame;

	@FindBy(xpath = "/html/body")
	WebElement text;

	@FindBy(xpath = "//*[@id=\"publisherAttachTextPost\"]/span[1]")
	WebElement postTab;

	@FindBy(xpath = "//*[@id=\"publishersharebutton\"]")
	WebElement sharebutton;

	@FindBy(xpath = "//a[@id='publisherAttachContentPost']")
	WebElement file;

	@FindBy(xpath = "//a[@id='chatterUploadFileAction']")
	WebElement openButton;

	@FindBy(xpath = "//input[@id='chatterFile']")
	WebElement upload;

	public WebElement getFrame1() {
		return frame1;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getPostTab() {
		return postTab;
	}

	public WebElement getSharebutton() {
		return sharebutton;
	}

	public WebElement getFile() {
		return file;
	}

	public WebElement getOpenButton() {
		return openButton;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getAbout() {
		return about;
	}

	public WebElement getEdit() {
		return edit;
	}

}
