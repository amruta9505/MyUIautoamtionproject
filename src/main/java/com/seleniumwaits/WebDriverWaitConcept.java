package com.seleniumwaits;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//webdriver wait is one type of implicit wait
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://demoauto.xyz/signin");
		driver.findElement(By.id("email")).sendKeys("admin02@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath(" //a[@title='Add lead']")).click();
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement companyname =wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_name")));
		companyname.sendKeys("TCS");
		*/
		
		By comp= By.id("company_name");
		By vatno=By.id("vat_number");
		waitForElementToPresent(comp, 10,2000).sendKeys("intel");
		System.out.println(waitForElementToPresent(vatno,5,1000).isEnabled());
		System.out.println(waitForElementToPresent(vatno,5,1000).isDisplayed());
		driver.findElement(By.xpath("//button[text()=' Save']")).click();
		System.out.println("done");
		
	}
	
	
	public static WebElement waitForElementToPresent(By locator,int timeout,long intervaltime)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, timeout,intervaltime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement waitForElementToPresent(By locator,int timeout)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}


}
