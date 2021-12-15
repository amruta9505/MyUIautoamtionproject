package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmproPageHraders {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		By header = By.tagName("h3");
		By headerlink = By.xpath("//ul/li");
		List<WebElement> headerlist = driver.findElements(header);
		System.out.println(headerlist.size());
		for (WebElement e : headerlist) {
			String HeaderText = e.getText();
			System.out.println(HeaderText);
		}

		ElementUtil eu = new ElementUtil(driver);

//		List<WebElement> headerlinklist = driver.findElements(headerlink);
//		System.out.println(headerlinklist.size());
//		for(WebElement e1 : headerlinklist)
//		{
//			String Hrefofheader =e1.getAttribute("href");
//			System.out.println(Hrefofheader);
//			String Headertextvalue=e1.getText();
//			System.out.println(Headertextvalue);
//		}
		
		eu.doLinkClick(headerlink,"Sign Up");

	}

}
