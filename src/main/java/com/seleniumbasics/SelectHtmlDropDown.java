package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHtmlDropDown {
	static WebDriver driver;
	public static void main(String[] args) {
		
		// html drop down:<select>
		//use select class in selenium
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		//WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
		//Select  select=new Select(country);
//		//select.selectByIndex(5);
		//select.selectByVisibleText("India");
//		select.selectByValue("American Samoa");
	//	By country=By.id("Form_submitForm_Country");
	//	doSelectByIndex(country, 5);
		//String text=select.getFirstSelectedOption().getText();
		//.out.println(text);
		By country=By.id("Form_submitForm_Country");
		Boolean b=doSelectByVisibleText(country, "India");
		System.out.println(b);
		
		

		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static Boolean doSelectByVisibleText(By locator, String text)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValueSelected(select, text);
	}
	public static void doSelectByValue(By locator, String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static Boolean isDropDownValueSelected(Select select,String expValue)
	{
		if(select.getFirstSelectedOption().getText().contains (expValue))
		{
			System.out.println(expValue+" is selected");
			return true;
		}
		return false;
	}
	
}
