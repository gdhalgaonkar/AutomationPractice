package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// POM --- Page Object Model --> collects all the elements using locators
	// of each page and store it in separate classes

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private static WebElement signIn;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getSignIn() {
		return signIn;
	}

}
