package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/");
		driver.manage().window().maximize();
		
//		WebElement content=driver.findElement(By.className("menulink"));
//		Actions act=new Actions(driver);
//		act.moveToElement(content).build().perform();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("COURSES")).click();
		
		By content=By.className("menulink");
		By courses=By.linkText("COURSES");
		By Articles=By.linkText("ARTICLES");
		
		parentChildMenuHandle(content, Articles);

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
