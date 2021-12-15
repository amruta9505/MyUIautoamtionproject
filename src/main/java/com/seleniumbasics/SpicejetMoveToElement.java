package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SpicejetMoveToElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil bu = new BrowserUtil();
		
		bu.initDriver("chrome");
		bu.launchUrl("https://beta.spicejet.com/");
		By Addons=By.xpath("//div[text()='Add-ons']");
		By SpiceMAX=By.xpath("//div[text()='SpiceMAX']");
		parentChildMenuHandle(Addons, SpiceMAX);

		
		
	

		//bu.quiteBrowser();

	}
	public static WebElement getElement(By locatore)
	{
		return driver.findElement(locatore);
	}
	
	public static void parentChildMenuHandle(By parent,By child) throws InterruptedException
	 {
		 Actions ac=new Actions(driver);
		 ac.moveToElement(getElement(parent)).build().perform();
		 Thread.sleep(2000);
		 getElement(child).click();
	 }

}
