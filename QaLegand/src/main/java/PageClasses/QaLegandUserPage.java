package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Pageutilities;

public class QaLegandUserPage 
{
	WebDriver driver;
@FindBy(xpath="//a[@class='btn btn-block btn-primary']")
WebElement addUserButton;
@FindBy(id="first_name")
WebElement firstName;
@FindBy(id="email")
WebElement email;
@FindBy(id="password")
WebElement passWord;
@FindBy(id="confirm_password")
WebElement confirmPassword;
@FindBy(id="submit_user_button")
WebElement saveButton;
@FindBy(xpath="//input[@class='form-control input-sm']")
WebElement searchUserTextbox;
@FindBy(xpath="(//tr[@class='odd' or @class='even']//td)[2]")
WebElement nameCell;
@FindBy(xpath="(//tr[@class='odd' or @class='even']//td)[4]")
WebElement emailcell;
@FindBy(xpath="//button[@class='btn btn-xs btn-danger delete_user_button']")
WebElement userDeletebtn;
@FindBy (xpath="//button[text()='OK']")
WebElement deleteConfirmationbtn;
@FindBy(xpath="//td[@class='dataTables_empty']")
WebElement datatableisEmpty;
@FindBy(xpath="(//a[@class='btn btn-xs btn-primary'])[1]")
WebElement edituserBtn;

public QaLegandUserPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public String emailcellvaluefinder()
{
	return (Pageutilities.getText(emailcell));
			}

public WebElement addUserBtn()
{
	return(addUserButton);//3rd method for calling element apart from page utility class 
}

public QaLegandUserPage addUser(String fName, String mail,String paswd)
{
	Pageutilities.enterText(firstName,fName);
	Pageutilities.enterText(email, mail);
	Pageutilities.enterText(passWord, paswd);
	Pageutilities.enterText(confirmPassword, paswd);
	Pageutilities.clickOnanElement(saveButton);
	return this;// chaining of object
			
	}
public void searchUser(String username)
{
	Pageutilities.clearText(searchUserTextbox);
	searchUserTextbox.sendKeys(username);
}
public String userNameFinder()
{
	String name=Pageutilities.getText(nameCell);
	return name;
	}
public QaLegandUserPage deleteUser()
{
Pageutilities.clickOnanElement(userDeletebtn);	
Pageutilities.clickOnanElement(deleteConfirmationbtn);
return this;

}
public String gettableStatus() 
{
	return(Pageutilities.getText(datatableisEmpty));
}
public void editUserEmail(String emailid)
{
	Pageutilities.clickOnanElement(edituserBtn);
	Pageutilities.clearText(email);
	Pageutilities.enterText(email, emailid);
	Pageutilities.clickOnanElement(saveButton);
	
	}

}


