package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		

		// Alerts window with ok button

		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Thread.sleep(2000); driver.switchTo().alert().accept();
		 */

		// Alerts window with ok and cancel button
		

		/*
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		*/
		
		// Alerts window input box button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("welcom amruta");
		a.accept();
		
		
		
		
		
		
		

	}
}
