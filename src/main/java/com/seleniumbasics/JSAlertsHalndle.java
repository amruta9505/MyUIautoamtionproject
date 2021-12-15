package com.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertsHalndle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		By clickforjsalert = By.xpath("//button[text()='Click for JS Alert']");
		By clickforjsconfirm = By.xpath("//button[text()='Click for JS Confirm']");

		By clickforjsprompt = By.xpath("//button[text()='Click for JS Prompt']");

		driver.findElement(clickforjsalert).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		Thread.sleep(5000);

		driver.switchTo().defaultContent();

		driver.findElement(clickforjsconfirm).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(5000);
		alert1.dismiss();

		driver.switchTo().defaultContent();

		driver.findElement(clickforjsprompt).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("amruta");
		alert2.accept();
		Thread.sleep(5000);

	}

}
