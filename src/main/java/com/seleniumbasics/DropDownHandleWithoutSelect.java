package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		By countryOptionXpath= By.xpath("//select[@id='Form_submitForm_Country']/option");
		doSelectDropDownWithoutSelect(countryOptionXpath, "India");
		
//		List<WebElement> optionslist=driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//		for(WebElement e:optionslist)
//		{
//			String Text=e.getText();
//			System.out.println(Text);
//			if(Text.equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}
		

	}
	
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void doSelectDropDownWithoutSelect(By locator, String value)
	{
		List<WebElement>countrylist=getElements(locator);
		for(WebElement e: countrylist)
		{
			String countrytext=e.getText();
			System.out.println(countrytext);
			if(countrytext.equals(value))
			{
				e.click();
				break;
			}
		}
	}
	
}
