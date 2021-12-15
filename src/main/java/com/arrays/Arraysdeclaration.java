package com.arrays;

public class Arraysdeclaration {
	public static void main(String[] args) {
		// array is an object
		// their are three diff way to  declare an array
		/* 
		 * 
		 *  1 way first declare and then  memory allocation
		int[] marks;
		marks=new int[5];
		
		
		*/
		
		/*
		2 way first declare + then memory allocation
		 int [] markes=new int[5];
		 
		 */
		
		// 3 way
		
		int [] marks= {100,90,99,80,88};
		System.out.println("lenth of int array is : "+marks.length);
		System.out.print("int array is :");
		for(int array: marks)
		{
			System.out.print(" "+array);
		}
		
		 
		 
		
		
		
		
	}

}
