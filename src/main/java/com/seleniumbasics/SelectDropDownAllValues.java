package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllValues {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		By countryList = By.id("Form_submitForm_Country");
		doSelectDropDown(countryList, "Hong Kong");

		// WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
//		Select  select=new Select(country);
//		List<WebElement> optionslist = select.getOptions();
//		System.out.println("toatl option of country"+optionslist.size());
		// using for loop
//		for(int i=0;i<optionslist.size();i++)
//		{
//			String countryText=optionslist.get(i).getText();
//			System.out.println(countryText);
//		}

		// using for each loop
//		
//		for(WebElement e:optionslist)
//		{
//			String countryText=e.getText();
//			System.out.println(countryText);
//			if(countryText.equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDown(By locator, String value)

	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String CountryText = e.getText();
			System.out.println(CountryText);
			if (CountryText.equals(value)) {
				e.click();
				break;
			}
		}

	}

}
