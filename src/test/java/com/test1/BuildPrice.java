package com.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildPrice {
	
	 private WebDriver driver;
		
		@FindBy(xpath = "//a[contains(text(),'Cars & Minivan')]]")
		WebElement cars_minivan;
		
		public void HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this); // initilialising driver for PageFactory class
		}
		
		public WebElement cars_minivanFn() {
			cars_minivan.click();
			return cars_minivan;
		}

}
