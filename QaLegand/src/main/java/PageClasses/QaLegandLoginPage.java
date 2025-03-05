package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Pageutilities;

public class QaLegandLoginPage {
	WebDriver driver ;
	@FindBy(id="username")
	WebElement usernameField;
	@FindBy(id="password")
	WebElement passwordField;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement LoginButton;

public QaLegandLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

public void LoginToQALegand(String username,String password)
{
	Pageutilities.enterText(usernameField,username);
	Pageutilities.enterText(passwordField, password);
	Pageutilities.clickOnanElement(LoginButton);
	}

	

	
	
	
	
}
