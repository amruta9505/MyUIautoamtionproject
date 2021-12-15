package com.arrays;

public class FloatArraysum {
	public static void main(String[] args) {
		
		float[] marks= {1.0f,2.0f,3.0f,5.0f,6.0f};
		float sum=0;
		for(float elements:marks)
		{
			sum=sum+elements;
			
		}
		System.out.println("sum of folat array is: "+sum);
		
		System.out.println("sum is for loop");
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
			
		}
		System.out.println(sum);
		
				
		
		
	}

}
