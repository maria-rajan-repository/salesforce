package com.salesforcenew.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.salesforcenew.utilities.ReadConfig;

import com.salesforcenew.utilities.ExtendReport;



public class BaseClass {
	
	ReadConfig readcon = new ReadConfig();
	
	public String baseurl = readcon.getApplicationURL();
	public String username = readcon.getUsername();
	public String password = readcon.getPassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	// added for xtnd report
	public static Properties prop;
	
	
	//@Parameters("browser")
	@BeforeClass
	public void driverSetUp() {
		
		System.setProperty("webdriver.chrome.driver", readcon.getChromepath());

		driver = new ChromeDriver();
		
		logger = Logger.getLogger(BaseClass.class);

		BasicConfigurator.configure();
		Properties prop = new Properties();
		// prop.setProperty(System.getProperty("user.dir") + "\\src\\test\\java\\com\\salesforcenew\\utilities\\log4j.properties","WARN");
		prop.setProperty(System.getProperty("user.dir") + "\\src\\test\\java\\com\\salesforcenew\\testCases\\log4j.properties","WARN");
		PropertyConfigurator.configure(prop);
		//launching browser
		//if(br.equals("chrome")){
		
		//}
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
		
		
		driver.get(baseurl);//launching the url
		
		
		
	}

//	@BeforeMethod
//	public void launchApp() throws IOException {
//
//		driverSetUp();
//		driver.get(getPropertynew("url"));
//		driver.manage().window().maximize();
//
//	}

//	public String getPropertynew(String getkey) throws IOException {
//		prop = new Properties();
//		String propPath = System.getProperty("user.dir") + "/Configuration/config.properties";
//		System.out.println(System.getProperty("user.dir") + "/src/test/java/com/salesforcenew/Configuration/config.properties");
//		FileInputStream configFile = new FileInputStream(propPath);
//		prop.load(configFile);
//		return prop.getProperty(getkey);
//	}

//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
	
	TakesScreenshot ts   = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);//capture the screenshot & stroe it in the specified location
	File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname +".png");
	FileUtils.copyFile(src, target) ;
	System.out.println("Screenshot taken");
	
	}
	
	

	
	// Method added for the Exend report
	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void loadConfig() {
		ExtendReport.setExtent();
		DOMConfigurator.configure("log4j.xml");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterSuite(groups = { "Smoke", "Regression","Sanity" })
	public void afterSuite() {
		ExtendReport.endReport();
	}
	
	
	
	
}