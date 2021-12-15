package com.avdanceXpath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoTable {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.espncricinfo.com/series/new-zealand-in-bangladesh-2021-1272089/bangladesh-vs-new-zealand-4th-t20i-1272096/full-scorecard");
		System.out.println(getWicketTakerName("Finn Allen"));
		System.out.println(getBatsManScoreList("Finn Allen"));
		System.out.println(getBatsManScoreList("Will Young"));
		System.out.println(getBallerScoreList("Nasum Ahmed"));
	}

	public static String getWicketTakerName(String batsmenName) {

		String wickettakername = "//a[text()='" + batsmenName + "']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(wickettakername)).getText();
	}

	public static List<String> getBatsManScoreList(String batsmenname) {
		String ScoreListXpath = "//a[text()='" + batsmenname + "']/parent::td/following-sibling::td";
		List<WebElement> Scorecardlist = driver.findElements(By.xpath(ScoreListXpath));
		List<String> scorevaluelist = new ArrayList<String>();
		for (int i = 1; i < Scorecardlist.size(); i++) {
			String text = Scorecardlist.get(i).getText();
			scorevaluelist.add(text);
		}
		return scorevaluelist;

	}

	public static List<String> getBallerScoreList(String ballername) {
		String ScoreListXpath = "(//a[text()='"+ballername+"'])[1]/parent::td/following-sibling::td";
		List<WebElement> ballerScoreList = driver.findElements(By.xpath(ScoreListXpath));
		List<String> scorevalueList = new ArrayList<String>();
		for (int i = 0; i < ballerScoreList.size(); i++) {
			String text = ballerScoreList.get(i).getText();
			scorevalueList.add(text);

		}
		return scorevalueList;

	}
}
