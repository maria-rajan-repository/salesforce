package com.salesforcenew.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportCustom {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void setExtent() {

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Configuration/" + "MyReport.html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/Configuration/extent-config.xml");

		htmlReporter.config().setDocumentTitle("SalesForce Automation Project");// Title of the project
		htmlReporter.config().setReportName("Fuctional Test Report");// name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);// location of the chart
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "Salesforce");
		extent.setSystemInfo("Tester", "Maria");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Browser", "Chrome");

//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
//		String repName ="Test-Report-"+timeStamp+".html";
//		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output"+repName);//specify location
//		htmlReporter.loadXMLConfig(System.getProperty(repName));

	}

	public static void endReport() {
		extent.flush();
	}
}
