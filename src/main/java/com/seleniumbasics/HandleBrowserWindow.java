package com.seleniumbasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowhandle()-------Return string 
	
		
//		String window=driver.getWindowHandle(); //return ID of the single browser window
//		System.out.println(window);
		
		//getWindowhandles()-------Return list of string
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		// First method- iterator()
		
		/*
		Iterator<String> it=windowIds.iterator();
		String parentwindowid=it.next();
		String childwindowid=it.next();
		System.out.println("parent window id is :"+parentwindowid);
		
		System.out.println("child window id is :"+childwindowid);
		*/
		
		// second method- using ArrayList
		
		/*List<String> windowIdlist=new ArrayList(windowIds); //coverting set to list
		
		String parentwinowid=windowIdlist.get(0);
		String childwinowid=windowIdlist.get(1);
		
		System.out.println("parent window id :"+parentwinowid);
		System.out.println("child window id:"+childwinowid);
		
		//how to use this windowids to switch the window
		
		driver.switchTo().window(parentwinowid);
		System.out.println("parent window title:"+driver.getTitle());
		
		driver.switchTo().window(childwinowid);
		System.out.println("child window title:"+driver.getTitle());
		
		*/
		
		//for each loop
		/*
		 for(String winid :windowIds)
		 {
			System.out.println(winid);
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
		 }
		 
		 */
		 
		// driver.close(); // close single browser window which were is open
		// driver.quit();  // close all browser window
		
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		 
		 
		 
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
