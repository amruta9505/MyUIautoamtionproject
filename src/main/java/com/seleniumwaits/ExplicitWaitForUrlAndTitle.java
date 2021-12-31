package com.seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForUrlAndTitle {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title=waitForTitleContains(10, "Login");
		System.out.println(title);

		driver.findElement(By.linkText("Register")).click();

		System.out.println(waitForUrlContains(10, "route=account/register"));
		System.out.println(waitForUrlToBe(10, "https://demo.opencart.com/index.php?route=account/register"));
		String title2=waitForTitleContains(10, "Register Account");
		System.out.println(title2);
		
		

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		if(wait.until(ExpectedConditions.urlContains("route=account/register"))) {
//			System.out.println(driver.getCurrentUrl());
//		}
//		
//		if(wait.until(ExpectedConditions.urlToBe("https://demo.opencart.com/index.php?route=account/register"))) {
//			System.out.println(driver.getCurrentUrl());
//		}	

	}

	public static boolean waitForUrlContains(int timeOut, String UrlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(UrlFraction));
	}

	public static boolean waitForUrlToBe(int timeOut, String url) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlToBe(url));

	}
	
	public static String waitForTitleContains(int timeout, String titlefraction) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
	if(wait.until(ExpectedConditions.titleContains(titlefraction))){
		return driver.getTitle();
	}
	return null;

}
	public static String waitForTitletoBe(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if( wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		return null;

	}
}
