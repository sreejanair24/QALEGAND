package TestScripts;

import org.testng.annotations.Test;

import com.github.javafaker.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.management.relation.RoleList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClasses.QaLegandHomePage;
import PageClasses.QaLegandLoginPage;
import PageClasses.QaLegandRoles;
import PageClasses.QaLegandSuppliers;
import PageClasses.QaLegandUserPage;
import PageClasses.QaSalesCommissionAgents;
import Utilities.ExcelUtilites;
import Utilities.Fakerutility;
import constants.Constants;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class QaLegandUsersTest extends BaseClass {
	WebDriver driver;

	@Test
public void createaUser()
{
	loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourbtnClick();
	homepage.clickOnUsermanagemnetButton();
	homepage.clickOnuserButton();
	userPage.addUserBtn().click();//3rd method continue
	String name=Fakerutility.getFakeFirstName();
	String emaild=name+Fakerutility.getRandomnumber()+"@gmail.com";
	String paswd="abcdefgh";
	userPage.addUser(name ,emaild,paswd);
	userPage.searchUser(name);
	Assert.assertEquals(userPage.userNameFinder(), name);
	
	}

@Test

public void deleteUser()
{
	loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourbtnClick();
	homepage.clickOnUsermanagemnetButton();
	homepage.clickOnuserButton();
	userPage.addUserBtn().click();//3rd method continue
	String name=Fakerutility.getFakeFirstName();
	String emaild=name+Fakerutility.getRandomnumber()+"@gmail.com";
	String paswd="abcdefgh";
	userPage.addUser(name ,emaild,paswd);
	userPage.searchUser(name);
	userPage.deleteUser();
	userPage.searchUser(name);
	Assert.assertEquals(userPage.gettableStatus(), "No matching records found");

	
}
	@Test
public void editUser()
{
		loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourbtnClick();
		homepage.clickOnUsermanagemnetButton();
		homepage.clickOnuserButton();
		userPage.addUserBtn().click();//3rd method continue
		String name=Fakerutility.getFakeFirstName();
		String emaild=name+Fakerutility.getRandomnumber()+"@gmail.com";
		String paswd="abcdefgh";
		userPage.addUser(name ,emaild,paswd);
		userPage.searchUser(name);
		String newemailid=name+Fakerutility.getRandomnumber()+"@outlook.com";
	userPage.editUserEmail(newemailid);
	userPage.searchUser(newemailid);
	Assert.assertEquals(userPage.emailcellvaluefinder(),newemailid);
		}

@Test
public void createSalesAgent()
{
loginPage.LoginToQALegand("Admin", "123456");
homepage.endTourbtnClick();
homepage.clickOnUsermanagemnetButton();
homepage.clickOnSalesCommissionAgentbutton();
addsalesAgent.clickSalesAgentbtn();
addsalesAgent.addSalesCommission("demoname", "25");
addsalesAgent.searchAgentName("demoname");
Assert.assertEquals(addsalesAgent.equals("demoname"), false);


}
		
@Test
public void AddRoles()
{
	loginPage.LoginToQALegand("Admin", "123456");
	homepage.endTourbtnClick();
	homepage.clickOnUsermanagemnetButton();
     homepage.clickOnRolestbutton();
     roles.clickAddRoles();
     String RoleN=Fakerutility.getFakeFirstName();
     roles.addName(RoleN);
     roles.selectRoles();
    roles.clickSave();
     roles.searchRoleName(RoleN);
}
@Test
public void SerchRolesByNumber() 
{
	loginPage.LoginToQALegand("Admin", "123456");
	homepage.endTourbtnClick();
	homepage.clickOnUsermanagemnetButton();
     homepage.clickOnRolestbutton();
     
     int size= roles.rolesSizeFinder();
     Assert.assertEquals(roles.rolesSizeFinder(), size);
    
    
}


@Test
public void deleteRoles() throws InterruptedException
{
	loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourbtnClick();
	homepage.clickOnUsermanagemnetButton();
	homepage.clickOnRolestbutton();
	roles.clickAddRoles();
    String dRole=Fakerutility.getFakeFirstName();
    roles.addName(dRole);
    roles.selectRoles();
    roles.clickSave();
    roles.clickDeleteBtn();
   //Thread.sleep(3000);
    roles.deletePopup();
	
	}
@Test
public void editRoles()
{
	loginPage.LoginToQALegand(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourbtnClick();
	homepage.clickOnUsermanagemnetButton();
	homepage.clickOnRolestbutton();
	roles.clickAddRoles();
     String RoleN=Fakerutility.getFakeFirstName();
     roles.addName(RoleN);
     roles.selectRoles();
    roles.clickSave();
     roles.searchRoleName(RoleN);
     roles.clickEditRolesbtn();
     String newroleName=Fakerutility.getFakeFirstName();
     roles.addName(newroleName);
     roles.clickSave();
     roles.searchRoleName(newroleName);
}

}

