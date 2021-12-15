package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrefAttributeValue {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br=new BrowserUtil();
		driver=br.initDriver("chrome");
		br.launchUrl("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		By aboubtuslink=By.linkText("About Us");
		By glass=By.xpath("//img[@alt='SYANKA Glass Wine Glass - Set Of 4, Clear, 360ml']");
		
		ElementUtil eu=new ElementUtil(driver);
		String Text=eu.doGetText(aboubtuslink);
		System.out.println(Text);
		System.out.println(eu.doGetAttributeValue(aboubtuslink,"href"));
		System.out.println(eu.checkElementDisable(aboubtuslink, "href"));
		
		String srcvalue=eu.doGetAttributeValue(glass, "src");
		System.out.println("src value of wineglass: "+srcvalue);
		String altvalue=eu.doGetAttributeValue(glass, "alt");

		
		
		
		
		
		
		
		
		
				

	}

}
