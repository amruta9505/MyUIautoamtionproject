package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil br=new BrowserUtil();
		driver=br.initDriver("chrome");
		br.launchUrl("https://www.amazon.in/");
//		List<WebElement> imageList =driver.findElements(By.tagName("img"));
//		System.out.println("list of images on the page: "+imageList.size());
//		for(int i=0;i<imageList.size();i++)
//		{
//			String altval=imageList.get(i).getAttribute("alt");
//			String srcval=imageList.get(i).getAttribute("src");
//			System.out.println("alt value is: "+altval);
//			System.out.println("src value is: "+srcval);
//
//		}
		
		
		// total no of links on the page and get its text also using for each loop
		
		List <WebElement> linkListOnPage=driver.findElements(By.tagName("a"));
		System.out.println("total nof links on the page is :" +linkListOnPage.size());
		
		for(WebElement e : linkListOnPage)
		{
			String toatlhref=e.getAttribute("href");
			System.out.println("href of link is: "+toatlhref);
			String Textval=e.getText();
			System.out.println("text of link is: "+Textval);
			
		}
		System.out.println("**************************************************************************************************************************");
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		
		//find oft toatl link on this site and print its href value
		
		List <WebElement> linkListDemoOpencart=driver.findElements(By.tagName("a"));
		System.out.println(linkListDemoOpencart.size());
		for(WebElement e1 :linkListDemoOpencart)
		{
			String Toatllink=e1.getAttribute("href");
			System.out.println(Toatllink);
			String Textvalue=e1.getText();
			System.out.println(Textvalue);
		}
		
		System.out.println("****************************************************************************************************************************");
		
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		
		List <WebElement>inputfield=driver.findElements(By.tagName("input"));
		
		System.out.println(inputfield.size());
		for(WebElement e2 : inputfield)
		{
			String placeholderval=e2.getAttribute("placeholder");
			System.out.println(placeholderval);
		}
		
	}
}
