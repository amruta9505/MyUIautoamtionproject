package com.javalogical.program;

public class MyThread1  extends Thread{
	@Override
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("My cooking Thread 1 is Running");
			System.out.println("I am Happy");
			i++;
		}
		
	}
	

}
