package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticationpopuphandle {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		// https://usname:password@url
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String username="admin";
		String password="admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
	}
	

}
