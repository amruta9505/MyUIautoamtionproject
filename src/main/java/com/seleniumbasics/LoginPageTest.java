package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		System.out.println(br.getPageUrl());
		System.out.println(br.getPageTitle());
		By username = By.id("input-email");
		By password = By.id("input-password");
		By submit = By.xpath("//input[@type='submit']");
		ElementUtil eleuUtil=new ElementUtil(driver);
		eleuUtil.doSendKays(username, "amrutajadhav@gmail.com");
		eleuUtil.doSendKays(password, "amruta@12345");
		eleuUtil.doClick(submit);
		br.closeBrowser();
		

	}

}
