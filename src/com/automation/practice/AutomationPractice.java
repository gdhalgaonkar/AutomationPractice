package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.AddToCart;
import com.baseclass.BaseClass;
import com.baseclass.HomePage;
import com.baseclass.SignInPage;

public class AutomationPractice extends BaseClass{
	public static void main(String[] args) throws InterruptedException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Dell\\eclipse-workspace\\SeleniumDemo\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("http://automationpractice.com/index.php");
		 *driver.manage().window().maximize();
		 *Thread.sleep(2000);
		 * WebElement loginSignIn = driver.findElement(By.xpath("//a[@class='login']"));
		 * loginSignIn.click();
		 */

		getBrowser("chrome");
		getURL("http://automationpractice.com/index.php");
		
		HomePage hp = new HomePage(driver);
		clickOnElement(hp.getSignIn());
		
		/*
		 * Thread.sleep(2000); WebElement email =
		 * driver.findElement(By.xpath("//input[@id= 'email']"));
		 * email.sendKeys("gandhali.dhalgaonkar@email.com");
		 * 
		 * Thread.sleep(2000); WebElement password =
		 * driver.findElement(By.xpath("//input[@id= 'passwd']"));
		 * password.sendKeys("Test123");
		 * 
		 * Thread.sleep(2000); WebElement signIn =
		 * driver.findElement(By.xpath("//button[@id='SubmitLogin']")); signIn.click();
		 */
		SignInPage sp = new SignInPage(driver);
		inputToElement(sp.getEmail(), "gandhali.dhalgaonkar@email.com");	
		inputToElement(sp.getPassword(), "Test123");
		clickOnElement(sp.getSignIn());
		
		AddToCart ac = new AddToCart(driver);		
		performAction(ac.getWomen());			
		clickOnElement(ac.getTshirt());		
		clickOnElement(ac.getImgTshirt());				
		clickOnElement(ac.getPlusQuantity());		
		clickOnElement(ac.getAddToCart());		
		clickOnElement(ac.getProToCheckout());		
		clickOnElement(ac.getShopCartProToCheckout());		
		//clickOnElement(ac.getShopCartProToCheckout());
		// (ac.getShopCartProToCheckout());
		
		inputToElement(ac.getComments(), "Additional comment about your order, please write it in the field below.");		
		clickOnElement(ac.getAddressProToCheckout());		
		clickOnElement(ac.getShippingProToCheckout());		
		clickOnElement(ac.getPopup());		
		clickOnElement(ac.getShippingProToCheckout());		
		clickOnElement(ac.getCheckPayment());		
		clickOnElement(ac.getConfMyOrder());		
		driver.close();
		
		
		/*
		 * Thread.sleep(5000); WebElement women =
		 * driver.findElement(By.xpath("//a[@title='Women']")); Actions ac1 = new
		 * Actions(driver); ac1.moveToElement(women).perform();
		 * 
		 * Thread.sleep(2000); WebElement tshirt =
		 * driver.findElement(By.xpath("//a[@title='T-shirts']"));
		 * //ac.moveToElement(tshirt).perform(); tshirt.click();
		 * 
		 * 
		 * Thread.sleep(2000); WebElement imageTshirt =
		 * driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		 * imageTshirt.click();
		 * 
		 * Thread.sleep(6000); Thread.sleep(2000);
		 * 
		 * WebElement plusQuantity = driver.findElement(By.
		 * xpath("//a[@class= 'btn btn-default button-plus product_quantity_up']"));
		 * plusQuantity.click();
		 * 
		 * Thread.sleep(2000); WebElement addToCart =
		 * driver.findElement(By.xpath("//button[@name='Submit']")); addToCart.click();
		 * 
		 * 
		 * Thread.sleep(2000); WebElement proToCheckout = driver.findElement(By.
		 * xpath("//a[@class= 'btn btn-default button button-medium']"));
		 * proToCheckout.click();
		 * 
		 * //Thread.sleep(2000); //driver.switchTo().defaultContent();
		 * 
		 * Thread.sleep(2000); WebElement shopCartProToCheckout = driver.findElement(By.
		 * xpath("//a[@class= 'button btn btn-default standard-checkout button-medium']"
		 * )); shopCartProToCheckout.click();
		 * 
		 * Thread.sleep(2000); WebElement comments =
		 * driver.findElement(By.xpath("//textarea[@class= 'form-control']")); comments.
		 * sendKeys("Additional comment about your order, please write it in the field below."
		 * );
		 * 
		 * Thread.sleep(2000); WebElement addressProToCheckout =
		 * driver.findElement(By.xpath("//span[text()= 'Proceed to checkout']"));
		 * addressProToCheckout.click();
		 * 
		 * Thread.sleep(2000); WebElement shippingProToCheckout = driver.findElement(By.
		 * xpath("//button[@class= 'button btn btn-default standard-checkout button-medium']"
		 * )); shippingProToCheckout.click();
		 * 
		 * Thread.sleep(2000); WebElement popup =
		 * driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']"));
		 * popup.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * shippingProToCheckout.click();
		 * 
		 * Thread.sleep(2000); WebElement checkPayment =
		 * driver.findElement(By.xpath("//a[@class= 'cheque']")); checkPayment.click();
		 * 
		 * Thread.sleep(2000); WebElement confMyOrder = driver.findElement(By.
		 * xpath("//button[@class= 'button btn btn-default button-medium']"));
		 * confMyOrder.click();
		 * 
		 * Thread.sleep(4000);
		 */	
	}
}
