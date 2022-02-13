package com.salesforcenew.testCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.salesforcenew.utilities.ReadConfig;

public class BaseClass {

	public static ExtentReports extendReport;

	public static ExtentHtmlReporter htmlReportter;
	public static ExtentTest testCase;

	ReadConfig readcon = new ReadConfig();
	public String baseurl = readcon.getApplicationURL();
	public String username = readcon.getUsername();
	public String password = readcon.getPassword();

//	public static WebDriver driver;
//	public static Logger logger;

	public WebDriver driver;
	public static Logger logger = Logger.getLogger(BaseClass.class);
	// public static Logger log = Logger.getLogger(BaseClass.class);

	@Parameters({ "OS", "browser" })
	@BeforeSuite
	public void driverSetUp() {

		extendReport = new ExtentReports();
		htmlReportter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\ExtendReport\\testReport.html");
		extendReport.attachReporter(htmlReportter);

		System.out.println("loc:" + System.getProperty("user.dir") + "\\test-output\\ExtendReport\\testReport.html");

//        //To add system or environment info by using the setSystemInfo method.
//		extendReport.setSystemInfo("OS", OS);
//		extendReport.setSystemInfo("Browser", browser);

		// configuration items to change the look and feel
		// add content, manage tests etc
		htmlReportter.config().setChartVisibilityOnOpen(true);
		htmlReportter.config().setDocumentTitle("Salesforce - Test automation");
		htmlReportter.config().setReportName("Salesforce - Test Automation Report");
		htmlReportter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReportter.config().setTheme(Theme.STANDARD);
		htmlReportter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		PropertyConfigurator.configure("C:\\Users\\antot\\OneDrive\\Documents\\Eclipse\\salesforce\\log4j.properties");
		logger.info("Log4j initilized");
		BasicConfigurator.configure();

	}

	public void infoLogger(String msg) {
		logger.info(msg);
		testCase.info(msg);

	}

	@BeforeMethod
	public void launchWeb() throws IOException {
		System.setProperty("webdriver.chrome.driver", readcon.getChromepath());
		driver = new ChromeDriver();
		driver.get(baseurl);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		// driver.quit();
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
//        	testCase.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
//        	testCase.fail(result.getThrowable());
			{
				String tgt_path = captureScreen(driver, result.getName());
				testCase.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
				testCase.fail(result.getThrowable());
				testCase.log(Status.FAIL, "Snapshot below: " + testCase.addScreenCaptureFromPath(tgt_path));
			}

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			testCase.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			testCase.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			testCase.skip(result.getThrowable());
		}
	}

	
	
	@AfterSuite
	public void closeDown() {
		System.out.println("Writing the report");
		extendReport.flush();
		System.out.println("write report complete");
	}

	public String captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		File src = ts.getScreenshotAs(OutputType.FILE);// capture the screenshot & store it in the specified location
		String target_file_path = System.getProperty("user.dir") + "/screenshots/" + tname + dateName + ".png";
		File target = new File(target_file_path);
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot taken and posted to " + target_file_path);
		return target_file_path;
	}
}