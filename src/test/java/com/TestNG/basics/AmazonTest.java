package com.TestNG.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	/**
	 * we use this pattern in regression testing
	 */
	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

	}

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void getCurrentUrl()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@Test
	public void isSearchDisplayedTest()
	{
//		Boolean search=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		System.out.println(search);
//		Assert.assertTrue(search);
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
		
	}
	
	@Test
	public void logoTest()
	{
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
