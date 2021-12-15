package com.TestNG.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestWithBeforeTest {
	
	/**
	 * this before test way we use for smoke/sanity testing
	 */
	static WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");

	}

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		
	}

	@Test
	public void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	@Test
	public void isSearchDisplayedTest() {
//		Boolean search=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		System.out.println(search);
//		Assert.assertTrue(search);
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());

	}

	@Test
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
