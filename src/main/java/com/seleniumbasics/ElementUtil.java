package com.seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKays(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doActionsSendkays(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public Boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public Boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	public Boolean doIsSelected(By locator) {
		return getElement(locator).isSelected();
	}

	public String doGetAttributeValue(By locator, String attrname) {
		return getElement(locator).getAttribute(attrname);
	}

	public Boolean checkElementDisable(By locator, String attrname) {
		String attrvale = doGetAttributeValue(locator, attrname);
		if (attrvale.equals("ture")) {
			return true;
		}
		return false;
	}

	public void doLinkClick(By locator, String attrvalue) {

		List<WebElement> lankList = getElements(locator);
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

	public Boolean checkElementDisplayed(By locator) {
		if (getElements(locator).size() == 1)
			return true;
		return false;
	}

	public Boolean checkElementDisplayed(By locator, int eleOccurance) {
		if (getElements(locator).size() == eleOccurance)
			return true;
		return false;
	}

	/*****************************************************
	 * DropDown Utility
	 ********************************************************************/

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectDropDown(By locator, String value)

	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		iteratorDropDownAndSelect(optionList, value);

	}

	public void doSelectDropDownWithoutSelect(By locator, String value) {
		List<WebElement> optionList = getElements(locator);
		iteratorDropDownAndSelect(optionList, value);

	}

	public void iteratorDropDownAndSelect(List<WebElement> optionList, String value) {
		System.out.println("total options:" + optionList.size());
		for (WebElement e : optionList) {
			String countrytext = e.getText();
			System.out.println(countrytext);
			if (countrytext.equals(value)) {
				e.click();
				break;
			}
		}

	}

	public Boolean isDropDownValueSelected(Select select, String expValue) {
		if (select.getFirstSelectedOption().getText().contains(expValue)) {
			System.out.println(expValue + " is selected");
			return true;
		}
		return false;
	}

	public Boolean doSelectByVisibleTextForBooleanValue(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		return isDropDownValueSelected(select, text);
	}

	/******************************************
	 * google Search util
	 *****************************************************************/
	public void googleSearchSelect(By serach, By suggestion, String searchKey, String value)
			throws InterruptedException {

		getElement(serach).sendKeys(searchKey);
		Thread.sleep(2000);

		List<WebElement> sugglist = getElements(suggestion);
		System.out.println(sugglist.size());

		for (WebElement e : sugglist) {
			String text = e.getText();
			System.out.println(text);
			if (text.trim().equals(value)) {
				e.click();
				break;
			}
		}
	}

	/************************************************************
	 * Action class utils
	 ******************************************************************/

	public void parentChildMenuHandle(By parent, By child) throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(getElement(parent)).build().perform();
		Thread.sleep(2000);
		doClick(child);
	}

	/*****************************************************
	 * Contextclick/Rightclick utils
	 *********************************************************/

	/**
	 * 
	 * @param rightclick
	 * @param items
	 * @return int i.e count of items
	 */

	public int rightClickMenuItemSize(By rightclick, By items) {
		return getRightclickByList(rightclick, items).size();
	}

	/**
	 * 
	 * @param rightclick
	 * @param items
	 * @param value
	 */

	public void clickOnRightClickItem(By rightclick, By items, String value) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclick)).perform();
		List<WebElement> menulist = getElements(items);
		for (WebElement e : menulist) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}

	}

	/**
	 * 
	 * @param rightclick
	 * @param items
	 * @return list of string
	 */

	public List<String> getRightclickByList(By rightclick, By items) {

		List<String> itemvaluelist = new ArrayList<String>();

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclick)).perform();

		List<WebElement> menulist = getElements(items);
		System.out.println(menulist.size());

		for (WebElement e : menulist) {
			String text = e.getText();
			System.out.println(text);
			itemvaluelist.add(text);
		}
		return itemvaluelist;
	}

}
