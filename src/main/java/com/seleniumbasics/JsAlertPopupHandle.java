package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopupHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		ElementUtil eu = new ElementUtil(driver);

		By submit = By.xpath("//input[@value='Sign in']");
		eu.doClick(submit);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		// alert.dismiss();
		
		driver.switchTo().defaultContent();

	}

}
