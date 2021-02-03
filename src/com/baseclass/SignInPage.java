package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@id= 'email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id= 'passwd']")
	private WebElement password;

	@FindBy(xpath = ("//button[@id='SubmitLogin']"))
	private WebElement signIn;

	public SignInPage(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIn() {
		return signIn;
	}

}
