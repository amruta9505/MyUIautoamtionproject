package com.seleniumwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForAlerts {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		System.out.println(getTextOnAlert(5));
		
		acceptAlert(5);
		
		
	}
	
	
	public static Alert waitForJSAlert(int timeout)
	{
		WebDriverWait wait =new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void acceptAlert(int timeout)
	{
		waitForJSAlert(timeout).accept();
	}
	
	public static void dismissAlert(int timeout)
	{
		waitForJSAlert(timeout).dismiss();
	}
	public static String getTextOnAlert(int timeout)
	{
		return waitForJSAlert(timeout).getText();
	}
	public static void sendKeysToAlert(int timeout,String value)
	{
		waitForJSAlert(timeout).sendKeys(value);
	}

}
