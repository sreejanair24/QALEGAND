
package Utilities;//used for generic methods like click ,drag ect;



import java.sql.Driver;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.Select;

public class Pageutilities {
	
	public static void clickOnanElement(WebElement element)//generic method for perform action 
	
	{
		element.click();
	}
public static void selectbyvalue(WebElement element,String value)
{
	Select select=new Select(element);
	select.deselectByValue(value);
	
}
public static void SelectByVisibleText(WebElement element, String text) {
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
public static void SelectByIndex(WebElement element, int index) {
	Select select=new Select(element);
	select.selectByIndex(index);
}
public static void enterText(WebElement element, String value)
{
	element.sendKeys(value);
	}


public static  void dragAndDrop(WebElement source ,WebElement destination , WebDriver driver)
{
Actions action =new Actions(driver);
action.dragAndDrop(source, destination).build().perform();
}
public static  void rightclickOnanElemnt(WebElement element, WebDriver driver)
{
Actions action =new Actions(driver);
action.contextClick(element).build().perform();

}
public static  void rightClick( WebDriver driver)
{
Actions action =new Actions(driver);
action.contextClick().build().perform();

}
public static  void mouseHover(WebElement element, WebDriver driver)
{
Actions action =new Actions(driver);
action.moveToElement(element).build().perform();

}
public static void clickUsingJavaScriptExcecuter(WebElement element, WebDriver driver)
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);
	}
public static void scrollTillElementVisibile(WebElement element, WebDriver driver)
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",element);
	}

public static boolean isElementVisible(WebElement element)
{
return(element.isDisplayed());
	}
public static boolean isElementEnabled(WebElement element)
{
	return (element.isEnabled());	
}
public static String getText(WebElement element)
{
	String value=element.getText();
return(value);
}
public static String getAttribute(WebElement element, String attributeName)
{
return(element.getAttribute(attributeName));
}
public static void navigateTo(WebDriver driver, String url)
{
	
driver.navigate().to(url);

	}
public static void navigateBack(WebDriver driver)
{
driver.navigate().back();

	}
public static void navigateForward(WebDriver driver)
{
driver.navigate().forward();

	}
public static void reFresh(WebDriver driver)
{
driver.navigate().refresh();

	}
public static void alertAccept(WebDriver driver)
{

driver.switchTo().alert().accept();
}
public static void alertDismiss(WebDriver driver)
{
driver.switchTo().alert().dismiss();
}
public static void clearText(WebElement element)
{
	element.clear();
}
public static void clickOnanElement(List<WebElement> element) {
	((WebElement) element).click();
	
}
}




