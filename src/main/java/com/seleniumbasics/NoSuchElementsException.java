package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementsException {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By serach=By.name("search11");
		By forgopaasword=By.linkText("Forgotten Password");
		//driver.findElement(serach).sendKeys("macbook"); no such element exception
		List<WebElement> searchlist=driver.findElements(serach);
		System.out.println(searchlist.size());
		
	
	}

}
