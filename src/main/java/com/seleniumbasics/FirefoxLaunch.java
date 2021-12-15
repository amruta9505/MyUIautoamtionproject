package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\selenium\\Driverexe\\LatestDriverExe\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();// launch browser

		driver.get("http://www.google.com");// enter url

		String title = driver.getTitle();// get the page title
		System.out.println("page title : " + title);

		// verfication point/checkpoint: act vs exp result
		if (title.equals("Google")) {
			System.out.println("title is correct");
		} else {
			System.out.println("wrong title");
		}
		// Automation Steps + verification point--> Automation Test (testing)

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getPageSource().contains("Copyright"));

		// driver.quit();//close the browser
		driver.close();// close the browser

	}

}
