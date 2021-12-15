package com.TestNG.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreshWorkTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Freshworks | Modern and Easy Customer and Employee Experience Software");
	}

	@Test(priority = 2)
	public void logoTest() {
		Assert.assertTrue(driver
				.findElement(By.xpath("//img[@src='/static-assets/images/common/company/logos/logo-fworks-white.svg']"))
				.isDisplayed());
	}

}
