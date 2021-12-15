package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestionListHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		By SearchByName=By.name("q");
		By suggeByxpath= By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span");
		
		googleSearchSelect(SearchByName, suggeByxpath, "selenium webdriver", "selenium webdriver download");
		
//		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
//		Thread.sleep(2000);
//		List<WebElement>sugglist=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span"));
//		System.out.println(sugglist.size());
//		for(WebElement e: sugglist)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.trim().equals("naveen automationlabs youtube"))
//			{
//				e.click();
//				break;
//			}
//		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void googleSearchSelect(By serach,By suggestion, String searchKey,String value) throws InterruptedException
	{
		
		getElement(serach).sendKeys(searchKey);
		Thread.sleep(2000);
		
		List<WebElement>sugglist=getElements(suggestion);
		System.out.println(sugglist.size());
		
		for(WebElement e: sugglist)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.trim().equals(value))
			{
				e.click();
				break;
			}
		}
	}

}
