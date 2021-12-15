package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By serach=By.name("search");
		By forgopaasword=By.linkText("Forgotten Password");
		
//		List<WebElement>serachlist=driver.findElements(serach);
//		if(serachlist.size()==1)
//		{
//			System.out.println("search is present on page");
//		}
//		else
//		{
//			System.out.println("search is not present");
//		}
		
	//	doGetElements(serach);
		System.out.println(checkElementDisplayed(serach));
		System.out.println(checkElementDisplayed(forgopaasword, 2));
		
	}
	
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static Boolean checkElementDisplayed(By locator)
	{
		if(getElements(locator).size()==1)
		return true;
		return false;
	}
	
	public static Boolean checkElementDisplayed(By locator,int eleOccurance)
	{
		if(getElements(locator).size()==eleOccurance)
		return true;
		return false;
	}

}
