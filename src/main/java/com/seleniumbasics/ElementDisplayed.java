package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		driver=br.initDriver("chrome");
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		Boolean flag=driver.findElement(By.id("input-email")).isDisplayed();
		System.out.println(flag); 
		
//		Boolean b=driver.findElement(By.name("search")).isEnabled();
//		System.out.println(b);
		By search=By.name("search");
		ElementUtil eu=new ElementUtil(driver);
		Boolean b=eu.doIsEnabled(search);
		System.out.println(b);
		
		driver.navigate().to("https://classic.freecrm.com/register/");
		driver.findElement(By.name("agreeTerms")).click();
		System.out.println(driver.findElement(By.name("agreeTerms")).isSelected());
		Boolean b1=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b1);
		Boolean b2=driver.findElement(By.id("submitButton")).isSelected();
		System.out.println(b2);
		
		 
		 

	}

}
