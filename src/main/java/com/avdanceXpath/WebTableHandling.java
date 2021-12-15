package com.avdanceXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(5000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		
		//driver.findElement(By.xpath("//a[text()='honour Cename']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		selectContact("01Kane William");
		System.out.println(getComapnayName("01Kane William"));
		selectContact("honour Cename");
		System.out.println(getComapnayName("honour Cename"));

		

	}
	
	public static void selectContact(String contactname)
	{
		String checkboxXpath="//a[text()='"+contactname+"']/parent::td/preceding-sibling::td/input[@type='checkbox']" ;
		driver.findElement(By.xpath(checkboxXpath)).click();
	}
	public static String getComapnayName(String contactname)
	{
	 String companynameXpath="//a[text()='"+contactname+"']/parent::td/following-sibling::td/a[@context='company']";
	 return driver.findElement(By.xpath(companynameXpath)).getText();
	}

}
