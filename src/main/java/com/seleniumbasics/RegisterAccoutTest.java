package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccoutTest {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.initDriver("chrome");
		bu.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By emailid=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By conformPass=By.id("input-confirm");
		
		ElementUtil eu=new ElementUtil(driver);
		eu.doSendKays(firstname, "amruta");
		eu.doSendKays(lastname, "jadhav");
		eu.doSendKays(emailid, "amrutajadhav9505@gmail.com");
		eu.doSendKays(telephone, "9834724947");
		eu.doSendKays(password, "amruta@12345");
		eu.doSendKays(conformPass, "amruta@12345");
		bu.closeBrowser();
		
	}

}
