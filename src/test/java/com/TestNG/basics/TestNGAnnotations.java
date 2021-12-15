package com.TestNG.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	/**
	 * TestNG: is java unit Testing framework or Junit is also used to write
	 * testcases Python: in python we have Pytest framwork to write testcases PHP:
	 * we have PHPunit framework JS:mocha/jasmin e framework C#:Nunit testing
	 * framwork
	 * 
	 * 
	 * TestNG feature:(testNG is library in the form of jar open source and free)
	 * you can write multiple testcases in testNG prioritize test cases data
	 * provider+ excel sheet HTML test Result report custome report: extent report
	 * allure report dependency test runner(XMl suite) parallel testing() in buitd
	 * multi threading cross browser testing logs pre condition and post condition
	 * annotation
	 * 
	 * 
	 * sequence of annotation
	 * 
	 * @Before suite
	 * @Before test
	 * @before class
	 *
	 * @before method
	 * @test
	 * @after method
	 * 
	 * @after class
	 * @after test
	 * @After suite
	 * 
	 * 
	 *        global pre condition-----@before pre condition--------------@before
	 *        test steps-------------------@test actual vs expected
	 *        condition----assersion post step--------------------@after
	 * 
	 *        status pass/fail------------------execution
	 * 
	 * 
	 * 
	 *        sequence
	 *        BS-------------------------connect with DB
	 *        BT-------------------------create DB user
	 *        BC-------------------------launch browser
	 *        
	 *        BT-------------------------login to app
	 *        T-------------------------homepage header test
	 *        AT-------------------------logOut from app
	 *        
	 *        BT-------------------------login to app 
	 *        T-------------------------home
	 *        Title TestTest AT-------------------------logOut from app
	 *        
	 *        BT-------------------------login to app
	 *        T-------------------------search Test
	 *        AT-------------------------logOut from app
	 *        
	 *        AC-------------------------close browser
	 *        AT-------------------------delete Db user
	 * 
	 */

	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS-------------------------connect with DB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT-------------------------create  DB user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-------------------------launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BT-------------------------login to app");
	}

	@Test
	public void homePageHeaderTest() {
		System.out.println("T-------------------------homepage header test");
	}

	@Test
	public void homeTitleTest() {
		System.out.println("T-------------------------home Title TestTest");
	}

	@Test
	public void searchTest() {
		System.out.println("T-------------------------search Test");
	}

	@AfterMethod
	public void logOutFromApp() {
		System.out.println("AT-------------------------logOut from app");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-------------------------close browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT-------------------------delete Db user");
	}

	@AfterSuite
	public void disconnectFromDB() {
		System.out.println("AS-------------------------disconnect Db connection");
	}

}
