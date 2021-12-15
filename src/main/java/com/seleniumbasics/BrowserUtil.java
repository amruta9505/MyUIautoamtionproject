package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public WebDriver driver;

	/**
	 * this method is use to  int the driver on the basic of given browser name
	 * @param browsername
	 * @return it returns the driver
	 */
	public WebDriver initDriver(String browsername) {
		System.out.println("browser name is :" + browsername);
		if (browsername.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","C:\\selenium\\Driverexe\\LatestDriverExe\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver","C:\\selenium\\Driverexe\\LatestDriverExe\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browsername.equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver","C:\\selenium\\Driverexe\\LatestDriverExe\\edgedriver_win64\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			System.out.println("please pass the right browser..." + browsername);
		}
		return driver;
	}

	public void launchUrl(String url) {
		if (url == null || url.isEmpty()) {
			System.out.println("url is incorrect");
			return;
		}
		driver.get(url);
		driver.manage().window().maximize();

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}
	public void quiteBrowser() {
		driver.quit();
	}

}
