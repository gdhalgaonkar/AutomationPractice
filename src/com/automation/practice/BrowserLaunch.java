package com.automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("weddriver.chrome.diver", "C:\\Users\\Dell\\eclipse-workspace\\AutomationPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	}
}
