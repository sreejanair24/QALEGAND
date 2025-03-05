package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Pageutilities;

public class QaSalesCommissionAgents {
	WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-primary btn-modal pull-right']")
	WebElement addsalesbtn;
	@FindBy(xpath="(//input[@id='first_name'])[1]")
	WebElement AgentFirstName;
	@FindBy(xpath="(//input[@id='cmmsn_percent'])[1]")
	WebElement commissionPercentage;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement SaleSaveBtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement searchSalesagent;
	
	
	
	
	
	public QaSalesCommissionAgents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSalesAgentbtn()
	
	{
		Pageutilities.clickOnanElement(addsalesbtn);
	}
	
	public void addSalesCommission(String FName,String  Commission)
	{
		
		Pageutilities.enterText(AgentFirstName, FName);
	
		Pageutilities.enterText(commissionPercentage, Commission);
		Pageutilities.clickOnanElement(SaleSaveBtn);
		Pageutilities.navigateBack(driver);
	}
	
	public void searchAgentName(String firstnameAgent)
	{
		Pageutilities.clearText(searchSalesagent);
		searchSalesagent.sendKeys(firstnameAgent);
	}

	
	

}
