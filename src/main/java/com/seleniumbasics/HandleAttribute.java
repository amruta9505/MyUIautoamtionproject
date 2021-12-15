package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAttribute {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
//		String attrval =driver.findElement(By.name("first_name")).getAttribute("type");
//		System.out.println(attrval);
		ElementUtil eu=new ElementUtil(driver);
		By typeattr=By.name("first_name");
		
		System.out.println(eu.doGetAttributeValue(typeattr,"type"));
		System.out.println(eu.checkElementDisable(typeattr, "type"));
		
	}

}
