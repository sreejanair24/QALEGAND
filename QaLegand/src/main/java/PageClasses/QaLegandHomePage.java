package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Pageutilities;

public class QaLegandHomePage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='User Management']")
	WebElement userManagementButton;
	@FindBy(xpath="//i[@class='fa fa-user']//following-sibling::span")
	WebElement userButton;
	@FindBy(xpath="(//span[@class='title'])[3]")
	WebElement rolesBtn;
	@FindBy(xpath="//i[@class='fa fa-handshake-o']//following-sibling::span")
	WebElement salesCommnAgentbtn;
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contacts;
	@FindBy(xpath="(//i[@class='fa fa-star']//preceding::a)[14]")
	WebElement suppliersbtn;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-sm']")
	WebElement endTourbtn;
	
	
	
	
	
	public QaLegandHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnUsermanagemnetButton()
	{
   Pageutilities.clickOnanElement(userManagementButton);	//pageutitles class is called from that class
		
	}
public void clickOnuserButton()
{
	userButton.click();//here called directly from page class(we can use two methods )
	
}

public void endTourbtnClick()
{
	try
	{
		endTourbtn.click();
	}catch(Exception e)
	{
	System.out.println("endtour button is not visible");
		
	}
}
	public void clickOnSalesCommissionAgentbutton()
	{
		salesCommnAgentbtn.click();
	}
	
	public void clickOnRolestbutton()
	{
		rolesBtn.click();
	}
	
	public void clickOnContactsButton()
	{
	Pageutilities.clickOnanElement(contacts);	//pageutitles class is called from that class
		
	}
	public void clickOnSupplierButton()
	{
	Pageutilities.clickOnanElement(suppliersbtn);	//pageutitles class is called from that class
		
	}
}
