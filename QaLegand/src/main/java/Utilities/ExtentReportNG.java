package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	static ExtentReports extent;
	public static ExtentReports getReportobject()
	{
		String path= System.getProperty("user.dir")+"\\test-output\\report.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);// used to customazie report like generate name , titile , and changes in report
		reporter.config().setReportName("webAutomationReport");
		reporter.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Sreeja.V.K");
		return extent;
		
	}
	
	
	
	
	
}