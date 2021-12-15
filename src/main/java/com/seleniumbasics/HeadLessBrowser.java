package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	public static void main(String[] args) {

		// headless browser--->Browser option ------> it will launch browser ,but it
		// will block the visibility(display)
		// GhostDriver+PlantonJS--------------> HeadLess Browser--->html source page of
		// the application
		// HtmlUnitDriver------>headless----->html page source of the aplication
		// testing is happening behind the scene
		// faster than UI mode
		// Headless mode is not recommended for the complex application//popups ,mouse
		// movement
		// recommended for sanity testing where we have maximum 15 to 20 test cases
		// headless---> complete non UI mode
		
		//1 for chrome driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--incognito");
		
		
		WebDriver driver=new ChromeDriver(co);
		
//		// 2.for firefox driver
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		//driver.quit();

	}

}
