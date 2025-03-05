package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;

public class Waitutilites {
public WebDriver driver;
public static void waitForClickingElemnt(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
public static void waitForTexttobePresentInElement(WebDriver driver,WebElement element,String text)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
public static void waitForelementtobeSelected(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.elementToBeSelected(element));
	}
public static void waitForVisibilityOfElement(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.visibilityOf(element));
	}
public static void waitForanAlertTobePresent (WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.alertIsPresent());

	}
public static void waitForanElemnetAttributeTobe (WebDriver driver,WebElement element,String attributename,String attributevalue)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.attributeToBe(element,attributename, attributevalue));

	}
public static void waitForElamenttobeInvisible(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICITWAIT));//calling static variable from constant class
	wait.until(ExpectedConditions.invisibilityOf(element));

	}

}
