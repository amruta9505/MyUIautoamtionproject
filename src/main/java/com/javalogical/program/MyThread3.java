package com.javalogical.program;

class MyThread3 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("My Thread 3 watching tv");
			System.out.println("I am confused");
			i++;
		}
		
	}	
}