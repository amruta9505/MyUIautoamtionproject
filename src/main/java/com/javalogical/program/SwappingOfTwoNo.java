package com.javalogical.program;

public class SwappingOfTwoNo {
	public static void main(String[] args) {
		int a=10,b=20;
		
		// 1 logic using third no;
	/*	System.out.println("before swapping value of a and b......."+a +" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("after swapping value of a and b......."+a +" "+b);	
		
		
		*/
		
		// logic 2 using + and - operator
		a=a+b;  //20+30=50
		b=a-b;  //50-30=20
		a=a-b;  //50-20=30
	
		System.out.println(" logic 2 after swapping value of a and b......."+a +" "+b);		

		
		
	}

}
