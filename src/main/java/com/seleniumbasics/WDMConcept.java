package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 for chrome driver 
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.com");
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
		
		
		
		//2 for fireforx driver
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.amazon.com");
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
		
		// 3 for edge driver
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		

	}

}
