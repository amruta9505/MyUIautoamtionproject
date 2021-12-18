package com.seleniumbasics;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		br.initDriver("chrome");

		br.launchUrl("https://www.amazon.com");
		System.out.println("url is launched");
		String title = br.getPageTitle();
		System.out.println(title);

		System.out.println(br.getPageUrl());

		br.quiteBrowser();

	}

}
