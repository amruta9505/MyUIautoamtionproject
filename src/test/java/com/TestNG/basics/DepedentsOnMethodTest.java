package com.TestNG.basics;

import org.testng.annotations.Test;

public class DepedentsOnMethodTest {
	@Test
	public void userdata()
	{
		String city="pune";
		System.out.println("city is"+city);
	}
	

	public void userCreate(String name, int age, String lastname) {
		System.out.println(name + " " + age+" "+lastname);
	}
	
	@Test
	public void usercreatetest()
	{
		System.out.println("user is created");
		userCreate("amruta", 26,"jadhav");
	}
	
	@Test
	public void updateUser()
	{
		System.out.println("update user");
		userCreate("amruta", 25,"jadhav");
	}
	
	
}
