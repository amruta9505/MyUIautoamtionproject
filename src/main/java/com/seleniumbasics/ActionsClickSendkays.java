package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickSendkays {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();

		By name = By.id("Form_submitForm_Name");
		By emailid = By.id("Form_submitForm_Email");
		By PrivacyPolicy = By.linkText("Privacy Policy");

		// driver.findElement(acctioncookies).click();

//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(name), "amruta").perform();
//		act.sendKeys(driver.findElement(emailid), "amrutajadhav@gmail.com").perform();
//		act.click(driver.findElement(PrivacyPolicy)).perform();
//		System.out.println("done");
		doActionsSendkays(name, "amruta");
		doActionsSendkays(emailid, "amrutajadhav@gmail.com");
		doActionsClick(PrivacyPolicy);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendkays(By locator,String value)
	{
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}
	
	public static void doActionsClick(By locator)
	{
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	

}
