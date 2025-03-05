package TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.ExcelUtilites;
import Utilities.Fakerutility;
import constants.Constants;

public class QaSupplierTest extends BaseClass {
	WebDriver driver;
	
	
	@Test
	public void createSupplier() throws InterruptedException
	{
		loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourbtnClick();
		homepage.clickOnContactsButton();
		homepage.clickOnSupplierButton();
		supplierPage.clickAddSupp();
		String supN=Fakerutility.getFakeFirstName();
		supplierPage.addSupName(supN);
		String busiN=Fakerutility.getFakeLastName();
		supplierPage.addbusName(busiN);
		supplierPage.selectBusiness();
		String mob=Fakerutility.getRandomnumber()+"CA";
		supplierPage.addNum(mob);
		supplierPage.saveSupp();//Explicit wait added here
	
		//Thread.sleep(10000);
		supplierPage.searchsupplier(supN);
	}
	@Test
	public void editSupplier() throws InterruptedException, IOException
	{
		loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourbtnClick();
		homepage.clickOnContactsButton();
		homepage.clickOnSupplierButton();
		supplierPage.clickAddSupp();
		String suppN=ExcelUtilites.getStringData(1, 0, Constants.EXCELFILEPATH, "Sheet1")+Fakerutility.getRandomnumber();
		supplierPage.addSupName(suppN);
		String busiN=ExcelUtilites.getStringData(1, 1, Constants.EXCELFILEPATH, "Sheet1")+Fakerutility.getRandomnumber();
		supplierPage.addbusName(busiN);
		supplierPage.selectBusiness();
		String mob=ExcelUtilites.getIntegerData(1, 2, Constants.EXCELFILEPATH, "Sheet1")+Fakerutility.getRandomnumber();
		supplierPage.addNum(mob);
		supplierPage.saveSupp();
		Thread.sleep(2000);
		supplierPage.searchsupplier(suppN);
		Thread.sleep(3000);
		supplierPage.clickEditSup();
		String newsupN=ExcelUtilites.getStringData(2, 3, Constants.EXCELFILEPATH, "Sheet1")+Fakerutility.getRandomnumber();
		//supplierPage.addSupName(newsupN);
		Thread.sleep(3000);
		System.out.println("suppname updtaed");
		Thread.sleep(3000);
		supplierPage.updateButton(newsupN);
		System.out.println("suppname updtaed");
		
		supplierPage.searchsupplier(newsupN);
		Thread.sleep(3000);
	}

	@Test
	public void viewSupplier() throws InterruptedException, IOException
	{
		loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourbtnClick();
		homepage.clickOnContactsButton();
		homepage.clickOnSupplierButton();
		supplierPage.viewSup();
		

	}

}
