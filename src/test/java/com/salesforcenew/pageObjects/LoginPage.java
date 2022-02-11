package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	WebElement emailAddressField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(id = "Login")
	WebElement loginButton;

	@FindBy(name = "pw")
	WebElement clearPassWordField;

	@FindBy(xpath = "//input[@id='rememberUn']")
	WebElement chkrememberMeButton;

	@FindBy(id = "error")
	WebElement actualErrorMessage;

	@FindBy(xpath = "//a[@id='forgot_password_link']")
	WebElement forgotPassword;

	
	
	
	
	
		
	

	public void setUserName(String userName) {

		emailAddressField.sendKeys(userName);

	}

	public void setPassword(String password) {

		passwordField.sendKeys(password);

	}

	public void clearPw() {

		passwordField.clear();

	}

	public void clickSubmit() {

		loginButton.click();

	}

	public String actualErrorMessage() {

		return actualErrorMessage.getText();
	}

	public void rememberMeButton() {
		chkrememberMeButton.click();
	}

	public WebElement forgotPassword() {
		return forgotPassword;
	}

	

	}


