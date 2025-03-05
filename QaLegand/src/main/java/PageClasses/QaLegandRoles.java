package PageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Pageutilities;

public class QaLegandRoles {
	
	WebDriver driver;
	@FindBy(xpath="//a[@class='btn btn-block btn-primary']")
	WebElement addRolesBtn;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement addRoleName;
	@FindBy(xpath="(//ins[@class='iCheck-helper'])[2]")
	WebElement roleUser;
	@FindBy(xpath="//tr[@class='odd' or @class='even']")
	List<WebElement> rolesList;
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	WebElement saveBtn;
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement search;
	@FindBy(xpath="//a[@class='btn btn-xs btn-primary']")
	WebElement editbtn;
	
	@FindBy(xpath="(//button[@class='btn btn-xs btn-danger delete_role_button'])[1]")
	WebElement deleterolesBtn;
	
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
	WebElement deleteOkBtn;
	
	
	
	
	public QaLegandRoles(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddRoles()
	
	{
		Pageutilities.clickOnanElement(addRolesBtn);
	}
	
	public void addName(String Rname) 
	{
	
	Pageutilities.enterText(addRoleName, Rname);
	
	}
	public void selectRoles() 
	{
		Pageutilities.clickOnanElement(roleUser);
	}
	
	public void clickSave()
	{
		
		
	Pageutilities.scrollTillElementVisibile(saveBtn, driver);
		
		Pageutilities.clickUsingJavaScriptExcecuter(saveBtn, driver);
		
	}
	public void searchRoleName(String namerole)
	{
		Pageutilities.clearText(search);
		search.sendKeys(namerole);
		
	}
	public int rolesSizeFinder()
	
	{
		
		System.out.println(rolesList.size());
		
		return(rolesList.size());
		
	}
	public void clickRolesListDropdown(List<WebElement> rList)
	{
	Pageutilities.clickOnanElement(rolesList);
		
	}
	
	public void clickDeleteBtn()
	{
		Pageutilities.clickOnanElement(deleterolesBtn);
	}
	public void clickEditRolesbtn()
	{
	Pageutilities.clickOnanElement(editbtn);	
	}
	public void deletePopup()
	{
		Pageutilities.clickOnanElement(deleteOkBtn);
	}
	}
	
	

	

