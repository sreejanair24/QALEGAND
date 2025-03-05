package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Pageutilities;
import Utilities.Waitutilites;


public class QaLegandSuppliers {
	WebDriver driver;

	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement addSupplierbutton;
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement SuppName;
	@FindBy(xpath="//input[@id='mobile']")
	WebElement MobNum;
	@FindBy(xpath="//select[@id='contact_type']")
	WebElement suppType;
	@FindBy(xpath="(//input[@class='form-control'])[2]")
	WebElement businessName;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement searchSupp;
@FindBy(xpath="(//button[@class='btn btn-info dropdown-toggle btn-xs'])[1]")
WebElement actionBtn;
@FindBy(xpath="(//a[@class='edit_contact_button'])[1]")
WebElement editbtn;
@FindBy(xpath="( //i[@class='fa fa-external-link'])[1]")
WebElement  viewBtn;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement updatBtn;
	
	
	
	
	
	
	public QaLegandSuppliers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void searchsupplier(String suprname)
	{
		Pageutilities.clearText(searchSupp);
		searchSupp.sendKeys(suprname);
	}
public void clickAddSupp()
	
	{
		Pageutilities.clickOnanElement(addSupplierbutton);
	}
	
	public void addSupName(String supname) 
	{
	
	Pageutilities.enterText(SuppName,supname);
	
	}
	public void selectBusiness()
	{
		Pageutilities.SelectByIndex(suppType, 1);
	}
	
		public void addNum(String num) 
		{
		
		Pageutilities.enterText(MobNum,num);
		
		
		}
		public void addbusName(String businessname) 
		{
		
		Pageutilities.enterText(businessName,businessname);
		
		}
		public void saveSupp()
		{
		Pageutilities.clickOnanElement(saveButton);
		Waitutilites.waitForElamenttobeInvisible(driver, saveButton);
		}
			
		public void clickEditSup()
		{
			Pageutilities.clickOnanElement(actionBtn);
			Pageutilities.clickOnanElement(editbtn);
		}
			
			
			
		
		public void updateButton(String newname)
		{
			Pageutilities.clearText(SuppName);
			Pageutilities.enterText(SuppName, newname);
			Pageutilities.clickOnanElement(updatBtn);
		}
		
		public void viewSup()
		{
			Pageutilities.clickOnanElement(actionBtn);
			Pageutilities.clickOnanElement(viewBtn);
			Pageutilities.clickOnanElement(saveButton);
}


}



	

