package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithWebElement {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

//		WebElement emailid =driver.findElement(By.id("input-email"));
//		emailid.sendKeys("amruta.jadhav@gmail.com");
//		
//		driver.navigate().refresh();
//		
//		/*
//		 * StaleElementReferenceException: stale Element Reference
//		 * element is not attached to dome page
//		 */
//		
//		emailid =driver.findElement(By.id("input-email"));
//		emailid.sendKeys("shubhu@gmail.com");

		By emailid = By.id("input-email");
		doSendKeys(emailid, "amrutajadhav@gmail.com");
		
		driver.navigate().refresh();
		doSendKeys(emailid,"shubhu@gmail.com");
		

	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}

}
