package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithFindelements {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		By footerlist=By.xpath("(//ul[@class='footer-nav'])[3]//a");
		doClicklist(footerlist);
		
//		List<WebElement> footerlist=driver.findElements(By.xpath("//footer//a"));
//		
//		System.out.println(footerlist.size()); 
//		for(WebElement e:footerlist)
//		{
//			System.out.println(e.getText());
//			e.click();
//		}

	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void doClicklist(By locator)
	{
		List<WebElement> footerlist = getElements(locator);
		System.out.println(footerlist.size());
		for(int i=0;i<footerlist.size();i++)
		{
			footerlist.get(i).click();
			driver.navigate().back();
			footerlist = getElements(locator);
			
			
		}
	}

}
