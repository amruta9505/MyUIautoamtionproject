package com.TestNG.basics;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name="java";
	
	@Test(expectedExceptions = { NullPointerException.class,ArithmeticException.class})
	public void userCreateTest()
	{
		System.out.println("user is created");
		int i=9/0;
		
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name); //NPE

		
	}
	
	@Test(expectedExceptions =Exception.class)
	public void userTest()
	{
		System.out.println("user is created");
		int i=9/0;
		
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name); //NPE

		
	}


}
