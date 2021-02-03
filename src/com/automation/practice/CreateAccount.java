package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.baseclass.HomePage;

public class CreateAccount extends BaseClass
{
	public static WebDriver driver;
	public static String url;
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver = getBrowser("chrome");
		url = getURL("http://automationpractice.com/index.php");
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDemo\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("http://automationpractice.com/index.php")
		 * driver.manage().window().maximize();
		 */
		//Thread.sleep(2000);
		
	
		
		//WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		//signIn.click();
		
		//Thread.sleep(2000);
		WebElement createAccEmailAddress = driver.findElement(By.xpath("//input[@id='email_create']"));
		inputToElement(createAccEmailAddress, "gandhali.dhalgaonkar@email.com");
		//createAccEmailAddress.sendKeys("gandhali.dhalgaonkar@email.com");
		
		Thread.sleep(2000);
		WebElement createAccButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		createAccButton.click();
		
		Thread.sleep(6000);//title???????
		WebElement titleMrs = driver.findElement(By.xpath("(//div[@class='radio'])[2]"));
		titleMrs.click();
		
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id = 'customer_firstname']"));
		firstName.sendKeys("Gandhali");
		
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("//input[@id = 'customer_lastname']"));
		lastName.sendKeys("Dhalgaonkar");
		
		Thread.sleep(2000);
		WebElement regPassword = driver.findElement(By.xpath("//input[@id = 'passwd']"));
		regPassword.sendKeys("Test123");
		
		Thread.sleep(6000);
		WebElement dateOfBirthDay = driver.findElement(By.xpath("//select[@id= 'days']"));
		Select s1 = new Select(dateOfBirthDay);
		s1.selectByValue("25");
		
		Thread.sleep(2000);
		WebElement dateOfBirthMonth = driver.findElement(By.xpath("//select[@id= 'months']"));
		Select s2 = new Select(dateOfBirthMonth);
		s2.selectByValue("12");
		
		Thread.sleep(2000);
		WebElement dateOfBirthYear = driver.findElement(By.xpath("//select[@id = 'years']"));
		Select s3 = new Select(dateOfBirthYear);
		s3.selectByValue("1992");	
		
		/*
		  Thread.sleep(2000); WebElement addressFirstName = 
		  driver.findElement(By.xpath("//input[@id = 'firstname']"));
		  addressFirstName.sendKeys("Gandhali");
		  
		  Thread.sleep(2000); WebElement addressLastName =
		  driver.findElement(By.xpath("//input[@id = 'lastname']"));
		  addressLastName.sendKeys("Dhalgaonkar");
		 
		
		Thread.sleep(2000);
		WebElement addressCompany = driver.findElement(By.xpath("//input[@id = 'company']"));
		addressCompany.sendKeys("Greens Technology");
		
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("//input[@id = 'address1']"));
		address.sendKeys("Ram Nagar, Chengulpeth");
		
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//input[@id = 'city']"));		
		city.sendKeys("Chennai");
		
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.xpath("//select[@id = 'id_state']"));
		Select s4 = new Select(state);
		s4.selectByIndex(10);
		
		Thread.sleep(2000);
		WebElement zipCode = driver.findElement(By.xpath("//input[@id = 'postcode']"));
		zipCode.sendKeys("11111");
		
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//select[@id = 'id_country']"));
		Select s5 = new Select(country);
		s5.selectByVisibleText("United States");
		
		Thread.sleep(2000);
		WebElement addInfo = driver.findElement(By.xpath("//textarea[@id= 'other']"));
		addInfo.sendKeys("This is additional Information");
		
		Thread.sleep(2000);
		WebElement homePhone = driver.findElement(By.xpath("//input[@id = 'phone']"));
		homePhone.sendKeys("7855446");
		
		Thread.sleep(2000);
		WebElement mobilePhone = driver.findElement(By.xpath("//input[@id = 'phone_mobile']"));
		mobilePhone.sendKeys("9456464564");
		
		/*
		 * Thread.sleep(2000); WebElement addAlias =
		 * driver.findElement(By.xpath("//input[@id = 'alias']"));
		 * addAlias.sendKeys("My Address");
		 */
		
		Thread.sleep(2000);
		WebElement registerButton = driver.findElement(By.xpath("//button[@id = 'submitAccount']"));
		registerButton.click();
		
		Thread.sleep(3000);
		//driver.close();
		
		System.out.println("Registration successfull");
		
		
		
	}
}
