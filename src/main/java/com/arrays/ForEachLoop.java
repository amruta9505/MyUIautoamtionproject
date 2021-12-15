package com.arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		
		/*float [] marks= {100,90,88.9f,98,96};
		System.out.println(marks.length);
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		String [] students= {"shubham"," amruta","ajay","ajay","pooja","hema"};
		System.out.println(students.length);
		System.out.println(students[5]);
		*/
		
		 int [] marks= {100,90,88,98,96};
		 int lenght=marks.length;
		 System.out.println(lenght);
		 System.out.println("using simple for loop");
		 for(int i=0;i<lenght;i++)
		 {
			 System.out.print(" " +marks[i]);
		 }
		 
		 System.out.println(" ");
		 System.out.println("revers for loop");
		 
		for(int i=lenght-1;i>0;i--)
		{
			System.out.println(marks[i]);
		}
		 System.out.println(" ");
		 System.out.println("using for each loop");
		 for(int arr:marks)
		 {
			 System.out.print( " "+arr);
		 }
		

		
		 
		
	}

}
