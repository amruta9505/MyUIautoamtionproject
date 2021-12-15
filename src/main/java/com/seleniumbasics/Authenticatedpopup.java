package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticatedpopup {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		//https://uer:password@URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
	}

}
