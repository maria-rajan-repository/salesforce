package com.salesforcenew.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;



public class HomePage extends LoginPage  {
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(id= "userNavButton")
	WebElement userMenu;
	
	@FindBy(linkText ="Logout")
	WebElement logout;
	
	@FindBy(linkText="My Profile")
	WebElement myProfile;
	
	@FindBy(linkText="My Settings")
	WebElement mySettings;

	



	public WebElement getMySettings() {
		return mySettings;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement userMenu()
	{
		return userMenu;
	}

	
	public WebElement logout() {
		return logout;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
