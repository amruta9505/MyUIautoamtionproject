package com.javalogical.program;

public class MyThreadRunnable1 implements Runnable {	
		public void run()
		{
			int i=0;
			while(i<10)
			{
			System.out.println(" I am a thread 1 not a threat 1");
			i++;
			}
			
			
		}
	

}
