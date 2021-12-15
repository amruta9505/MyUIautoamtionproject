package com.avdanceXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableTraverse {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// table[@id="customers"]/tbody/tr[2]/td[1]
		// table[@id="customers"]/tbody/tr[3]/td[1]
		// table[@id="customers"]/tbody/tr[4]/td[1]
		// table[@id="customers"]/tbody/tr[5]/td[1]
		// table[@id="customers"]/tbody/tr[6]/td[1]
		// table[@id="customers"]/tbody/tr[7]/td[1]
//		String staringXpath="//table[@id=\"customers\"]/tbody/tr[";
//		String endingXpath="]/td[1]";
//		List<WebElement> rowCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
//		
//		for(int row=2; row<=rowCount.size();row++)
//		{
//			String companyXpath=staringXpath+row+endingXpath;
//			String Comapnytext=driver.findElement(By.xpath(companyXpath)).getText();
//			System.out.println(Comapnytext);
//		}
		
		getComapnyData("1");
		getComapnyData("2");
		getComapnyData("3");
		

	}

	public static void getComapnyData(String columnNo) {
		String staringXpath="//table[@id=\"customers\"]/tbody/tr[";
		String endingXpath="]/td["+columnNo+"]";
		List<WebElement> rowCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		
		for(int row=2; row<=rowCount.size();row++)
		{
			String companyXpath=staringXpath+row+endingXpath;
			String Comapnytext=driver.findElement(By.xpath(companyXpath)).getText();
			System.out.println(Comapnytext);
		}

	}

}
