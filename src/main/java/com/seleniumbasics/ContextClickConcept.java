package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	}
	
}
