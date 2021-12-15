package com.javalogical.program;

class MyThreadRunnable2 implements Runnable
{

	public void run()
	{
		int i=0;
		while(i<10)
		{
		System.out.println(" I am a thread 2 not a threat 2");
		i++;
		}
	}
}
