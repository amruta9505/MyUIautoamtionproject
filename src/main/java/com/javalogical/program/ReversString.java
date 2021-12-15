package com.javalogical.program;

public class ReversString {
	public static void main(String[] args) {
		String str="ABCD";
		String rev="";
		
		/*  // using 1 way
		 * int len=str.length();
		System.out.println(len);
		
		for (int i = len-1; i>=0; i--) 
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.print("revers string is : "+rev);
		*/
		
		// using  char array
		
		/*
		char a[]= str.toCharArray();
		int len=a.length;
		System.out.println(len);
		for (int i=len-1; i>=0; i--) {
			rev=rev+a[i];
			
		}
		System.out.println("revers string is: " +rev);
		*/
		
		// using StringBuffer
		/* StringBuffer sb=new StringBuffer();
		 sb.append(str);
		 System.out.println(sb.reverse());
		 */
		
		
		 
		 // using  stringBuilder
		 StringBuilder sb1=new StringBuilder(str);
		 System.out.println(sb1.reverse());
		
		
		
	
		
		
		
		
	}

}
