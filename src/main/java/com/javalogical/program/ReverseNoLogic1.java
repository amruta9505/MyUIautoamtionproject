package com.javalogical.program;

import java.util.Scanner;

public class ReverseNoLogic1 {
	public static void main(String[] args) {

		// 1 way
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("enter no"); 
		 * int num=sc.nextInt();
		 * 
		 * int rev=0; while(num!=0) { rev=rev*10+num%10; num=num/10;// }
		 * 
		 * System.out.println(rev);
		 * 
		 */

		// 2 way
		/*
		 * int num = 105; int rev = 0; 
		 * while (num != 0) {
		 *  rev = rev * 10 + num % 10;
		 *  num= num / 10; 
		 *  } 
		 *  System.out.println(rev); 
		 *  System.out.println(num);
		 */
		
		// 3 way
		
		/*
		 * 
		int num=123;
		int rev=0;
		
		while (num!=0) {
			 rev=num%10;
			num=num/10;
			System.out.print(rev);	
		}
		
		*/
		
		// 4 using string buffer class
		/*
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter no"); 
		 int num=sc.nextInt();
		 StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer revno= sb.reverse();
		System.out.println("revers no is :"+revno);
		
		*/
		// 5 way using StringBuilder
		 
		/*
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter no"); 
		 int num=sc.nextInt();
		 StringBuilder sb=new StringBuilder(String.valueOf(num));
		StringBuilder revno= sb.reverse();
		System.out.println("revers no is :"+revno);
		*/
		
		// 6 way using StringBuilder with append method
		
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter no"); 
		 int num=sc.nextInt();
		 StringBuilder sb=new StringBuilder();
		 sb.append(num);
		StringBuilder revno= sb.reverse();
		System.out.println("revers no is :"+revno);
		
		
		
		
				
		
		
	}

}
