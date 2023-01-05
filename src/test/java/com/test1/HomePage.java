package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  private WebDriver driver;
	
	@FindBy(xpath = "//li/button[contains(text(),'Shopping')]")
	WebElement shoppingToolsBtn;

	@FindBy(xpath = "//a/span[contains(text(),'Build & Price')]")
	WebElement buildPrice;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initilialising driver for PageFactory class
	}
	
	public WebElement shoppingToolsFn() {
		
		shoppingToolsBtn.click();
		return shoppingToolsBtn;
	}
	public WebElement buildPriceFn() {
		buildPrice.click();
		return buildPrice;
	}

}
