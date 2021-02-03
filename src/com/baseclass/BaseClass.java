package com.baseclass;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass 
{
	public static WebDriver driver;
	public static String url;
	public static WebDriver getBrowser(String browserName) 
	{
		try {
			if (browserName.equalsIgnoreCase("chrome")) 
			{		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDemo\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			
			}
			else if (browserName.equalsIgnoreCase("ie")) 
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDemo\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else {
				System.out.println("Invalide Browser Name" +browserName);
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	} 
		catch (Exception e)	{
			
				e.printStackTrace();
			}
		return driver;
	}
	
	public static String getURL(String url) 
	{
		try 
		{
			driver.get(url);
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return url;

	}
	
	public static void waitForElement( WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	public static void inputToElement(WebElement element, String value) 
	{
		waitForElement(element);
		try 
		{
			element.sendKeys(value);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public static void selectDropDown(WebElement element, String option, String value) 
	{
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")){
			s.selectByValue(value);
		}
		else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (option.equalsIgnoreCase("id")) {
			s.selectByIndex(Integer.parseInt(value));
		}	
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();

	}
	
	public static void performAction(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}
}
	
	


