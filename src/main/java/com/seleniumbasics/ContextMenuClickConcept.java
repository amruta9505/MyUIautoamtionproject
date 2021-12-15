package com.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextMenuClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		By rightclickme = By.xpath("//span[text()='right click me']");
		By menulist = By.xpath("  //ul[@class='context-menu-list context-menu-root']/li/span");
		
		List<String>itemlist=getRightclickByList(rightclickme, menulist);
		if(itemlist.contains("Edit"))
		{
			System.out.println("Edit present");
		}
		
		clickOnRightClickItem(rightclickme, menulist, "Edit");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	
	public static int rightClickMenuItemSize(By rightclick,By items)
	{
		return getRightclickByList(rightclick, items).size();
	}
	
	public static void clickOnRightClickItem(By rightclick, By items,String value)
	{
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclick)).perform();
		List<WebElement>menulist=getElements(items);
		for(WebElement e: menulist)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
			}
		}
		
		 
	}
	public static List<String> getRightclickByList(By rightclick, By items) {

		List<String> itemvaluelist=new ArrayList<String>();
		
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclick)).perform();

		List<WebElement> menulist = getElements(items);
		System.out.println(menulist.size());
		
		for (WebElement e : menulist) {
			String text = e.getText();
			//System.out.println(text);
			itemvaluelist.add(text);
		}
		return itemvaluelist;
	}

}
