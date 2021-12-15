package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();

		// create webelement + perform some
		// action(sendkeys,click,getText,isDispplay....)
		// findelement is metthod of search context interface and overriden by webDriver
		// interface

		// 1 way
//		driver.findElement(By.id("input-email")).sendKeys("amrutajadhav");
//		driver.findElement(By.id("input-password")).sendKeys("amrutajadhav1234");
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		// 2 way
//		
//		WebElement username=driver.findElement(By.id("input-email"));
//		username.sendKeys("amrutajadhav");
//		
//		WebElement password=driver.findElement(By.id("input-password"));
//		password.sendKeys("amrutajadhav1234");
//		
//		WebElement submit=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
//		submit.click();
//	
//		

		// 3 way BY locator strategy
//		By username=By.id("input-email");
//		driver.findElement(username).sendKeys("amrutajadhav");
//		
//		By password=By.id("input-password");
//		driver.findElement(password).sendKeys("amrutajadhav12345");
//		
//		By submit=By.xpath("//input[@type=\"submit\"]");
//		driver.findElement(submit).click();
//		
//		
		// 4 way

//		By username=By.id("input-email");
//		WebElement eId=driver.findElement(username);
//		
//		By password=By.id("input-password");
//		WebElement pwd=driver.findElement(password);
//		
//		By submit=By.xpath("//input[@type=\"submit\"]");
//		WebElement enter=driver.findElement(submit);
//		
//		
//		eId.sendKeys("amrutajadhav");
//		pwd.sendKeys("amrutajadhav12345");
//		enter.click();

		// 5 way by using generic method
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		By submit = By.xpath("//input[@type=\"submit\"]");
//		getElement(username).sendKeys("amrutajadhav@gmail.com");
//		getElement(password).sendKeys("amruta@12345");
//		getElement(submit).click();

		// 6 way

//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		By submit = By.xpath("//input[@type=\"submit\"]");
//		doSendKays(username, "amrutajadhav@gmail.com");
//		doSendKays(password, "amruta@12345");
//		doClick(submit);

		// 7 way

		By username = By.id("input-email");
		By password = By.id("input-password");
		By submit = By.xpath("//input[@type=\"submit\"]");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.doSendKays(username, "amrutajadha@gmail.com");
		eleutil.doSendKays(password, "amruta@12345");
		eleutil.doClick(submit);
		

		System.out.println("done");
		driver.quit();

	}

}
