package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		selectChoice(choices, "choice 1");
		//selectChoice(choices, "choice 1","choice 2","choice 3");
	}
	
	public static void selectChoice(By locator,String... value)
	{
		List<WebElement> choicelist=driver.findElements(locator);
		for(int i=0;i<choicelist.size();i++)
		{
			String choicetext=choicelist.get(i).getText();
			System.out.println(choicetext);
			
			for(int j=0; j<value.length;j++)
			{
				if(choicetext.equals(value[j])) {
					choicelist.get(i).click();
					break;
				}
			}
			
		}
	}

}
