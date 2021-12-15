package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
//		 WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
//		 driver.get("https://www.google.com/");
//		 driver.manage().window().maximize();

		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("chrome");
		br.launchUrl("https://www.google.com/");
		driver.manage().window().maximize();
		By Languagelist = By.xpath("//div[@id='SIvCob']/a");
		By footerlist = By.xpath("//footer//a");

		

//		List<WebElement> languageList =driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(languageList.size());
//		for(WebElement e :languageList)
//		{
//			String hrefvalue=e.getAttribute("href");
//			System.out.println(hrefvalue);
//			String linktext=e.getText();
//			System.out.println(linktext);
//			
//			
//			if(linktext.trim().equals("मराठी"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		
		doLinkClick(Languagelist, "मराठी");
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		doLinkClick(footerlist, "Contact Us");

	}
	
	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doLinkClick(By locator, String attrvalue) {

		List<WebElement> lankList = doGetElements(locator);
		for (WebElement e : lankList) {
			String hrefvalue = e.getAttribute("href");
			System.out.println(hrefvalue);
			String linktext = e.getText();
			System.out.println(linktext);

			if (linktext.trim().equals(attrvalue)) {
				e.click();
				break;
			}
		}

	}

}
