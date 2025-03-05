package TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageClasses.QaLegandHomePage;
import PageClasses.QaLegandLoginPage;
import PageClasses.QaLegandRoles;
import PageClasses.QaLegandSuppliers;
import PageClasses.QaLegandUserPage;
import PageClasses.QaSalesCommissionAgents;
import Utilities.Screenshotutility;

public class BaseClass {
	
public 	WebDriver driver;
	QaLegandLoginPage loginPage;
	QaLegandHomePage homepage;
	QaLegandUserPage userPage;
	QaSalesCommissionAgents addsalesAgent;
	QaLegandRoles roles;
	QaLegandSuppliers supplierPage;
	Properties prop;
	FileInputStream fis;//to obtain file access
	

		public WebDriver initializeMethod(String browser) throws Exception
		{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{

			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{

			driver=new FirefoxDriver();
		}
		
		else
		{
			throw new Exception("invalid browser name");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
		
		}
		@BeforeMethod
		public void browserInitialization() throws Exception
		{
			driver= initializeMethod("Chrome");
			prop=new Properties();
			String path=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\data.properties";//set a dynamic path for common access
			fis=new FileInputStream(path);
			prop.load(fis);//loading the property file to prop;
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			loginPage=new QaLegandLoginPage(driver);
			homepage=new QaLegandHomePage(driver);
			userPage=new QaLegandUserPage(driver);
			addsalesAgent=new QaSalesCommissionAgents(driver);
			roles =new QaLegandRoles(driver);
			supplierPage=new QaLegandSuppliers(driver);
		
}
		@AfterMethod
		public void afterMethod(ITestResult itResult) throws IOException {
			if(itResult.getStatus()==ITestResult.FAILURE) {
				Screenshotutility sc= new Screenshotutility();
			sc.captureFailureScreenshots(driver, itResult.getName());
			}
			if(driver!=null) {
				//driver.quit();
			}	

}}
