//Base Class for Toyota Project
package com.test1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

    public class BaseClass {
	WebDriver driver;
	
	HomePage homePage;
	BuildPrice buildPrice;
	
	@BeforeTest
	public void setup()
	{
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		driver.navigate().to("https://www.toyota.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
	}
	@Test
	public void homePage()
	{
		System.out.println("Page Title is :"+driver.getTitle());
	//	Assert.assertEquals("Cars, Trucks, SUVs & Hybrids | Toyota Official Site", driver.getTitle());
	 homePage =new HomePage(driver);
	 
	 homePage.shoppingToolsFn();
	 homePage.buildPriceFn();
	 
	 buildPrice =new BuildPrice();
	 buildPrice.cars_minivanFn();
	// buildPrice.();
	 
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
