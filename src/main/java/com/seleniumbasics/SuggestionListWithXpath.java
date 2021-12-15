package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionListWithXpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php?id_product=3&controller=product");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("search_query_top")).sendKeys("dress");
//		
//		Thread.sleep(5000);
//		 driver.findElement(By.xpath("//li[contains(text(),'Casual Dresses > Printed ')]")).click();
//		

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='automation']/b[text()=' projects']")).click();
		
	}

}
