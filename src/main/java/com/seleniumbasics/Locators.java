package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) {
		
		// 1.id is unique locator
		//2.name can be duplicate
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize();
		 
//		 // 1 way
//		 driver.findElement(By.name("firstname")).sendKeys("amruta");
		 
//		 // 2 way
//		 WebElement firstname=driver.findElement(By.name("firstname"));
//		 firstname.sendKeys("amruta");
		 
		 //3 way
//		 By firstname=By.name("firstname");
//		 driver.findElement(firstname).sendKeys("amruta");
		 
		 // 4 way
		 ElementUtil eu=new ElementUtil(driver);
		 By firstname=By.name("firstname");
		 By lastname=By.id("input-lastname");
		 
		 eu.doSendKays(firstname, "amruta");
		 eu.doSendKays(lastname, "jadhav");
		 
		 // 3 locate by using className(it is dupicate) we genegrally dont prefer this approach
		// driver.findElement(By.className("form-control")).sendKeys("amruta");
		 
		 
		 // 4 Xpath---> it is not attribute ----> it is one of the way to locate the element on web page (inside the HTML DOM )
		  //driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("amruta");
		 
		 
		 //5 css selector-----> again this is also not the attribute --- is a locator
		 //driver.findElement(By.cssSelector("#input-firstname")).sendKeys("amruta");
		 
		 
		 //6 linktext----------> lacator--------->only for links--->html tag---> a tag<a>----> anchor tag
		 //driver.findElement(By.linkText("Login")).click();
		 
		//  7 Partial linktext----------> lacator--------->only for links--->html tag---> a tag<a>----> anchor tag
		 driver.findElement(By.partialLinkText("Delivery")).click();
		 
		 
		 //8 tagName---> html tag---> is a locator 
//		 String header=driver.findElement(By.tagName("h2")).getText();
//		 System.out.println(header);

		 
		 
		 
		 
		 
		
	}

}
