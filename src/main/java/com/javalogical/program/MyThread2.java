package com.javalogical.program;

class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("My Thread 2 for chatting with him");
			System.out.println("I am sad");
			i++;
		}
		
	}
	

}