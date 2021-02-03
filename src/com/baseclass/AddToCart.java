package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart
{
	public static WebDriver driver;
	
	public AddToCart(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath= ("//a[@title='Women']"))
	private WebElement women;

	public WebElement getWomen() {
		return women;
	}
	
	@FindBy (xpath = ("//a[@title='T-shirts']"))
	private WebElement tshirt;

	public WebElement getTshirt() {
		return tshirt;
	}
	
	@FindBy (xpath = ("//img[@title='Faded Short Sleeve T-shirts']"))
	private WebElement imgTshirt;

	public WebElement getImgTshirt() {
		return imgTshirt;
	}

	@FindBy (xpath = ("//a[@class= 'btn btn-default button-plus product_quantity_up']"))
	private WebElement plusQuantity;

	public WebElement getPlusQuantity() {
		return plusQuantity;
	}
	
	@FindBy (xpath = ("//button[@name='Submit']"))
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@FindBy (xpath = ("//a[@class= 'btn btn-default button button-medium']"))
	private WebElement proToCheckout;
	
	public WebElement getProToCheckout() {
		return proToCheckout;
	}
	
	@FindBy (xpath = ("//a[@class= 'button btn btn-default standard-checkout button-medium']"))
	private WebElement shopCartProToCheckout;

	public WebElement getShopCartProToCheckout() {
		return shopCartProToCheckout;
	}
	
	@FindBy (xpath = ("//textarea[@class= 'form-control']"))
	private WebElement comments;
	
	public WebElement getComments() {
		return comments;
	}

	@FindBy (xpath = ("//span[text()= 'Proceed to checkout']"))
	private WebElement addressProToCheckout;
	
	public WebElement getAddressProToCheckout() {
		return addressProToCheckout;
	}
	
	@FindBy (xpath = ("//button[@class= 'button btn btn-default standard-checkout button-medium']"))
	private WebElement shippingProToCheckout;

	public WebElement getShippingProToCheckout() {
		return shippingProToCheckout;
	}
	
	@FindBy (xpath = ("//a[@class='fancybox-item fancybox-close']"))
	private WebElement popup;

	public WebElement getPopup() {
		return popup;
	}
	
	@FindBy (xpath=("//a[@class= 'cheque']"))
	private WebElement checkPayment;
	
	public WebElement getCheckPayment() {
		return checkPayment;
	}
	
	@FindBy (xpath=("//button[@class= 'button btn btn-default button-medium']"))
	private WebElement confMyOrder;
	
	public WebElement getConfMyOrder() {
		return confMyOrder;
	}	
	

}
